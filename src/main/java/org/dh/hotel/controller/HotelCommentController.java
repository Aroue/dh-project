package org.dh.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dh.hotel.entity.dto.HotelComment.HotelCommentA01DTO;
import org.dh.hotel.entity.dto.HotelComment.HotelCommentA01InputDTO;
import org.dh.hotel.entity.dto.HotelComment.HotelCommentA02InputDTO;
import org.dh.hotel.entity.dto.HotelComment.HotelCommentA03InputDTO;
import org.dh.hotel.entity.entity.HotelComment;
import org.dh.hotel.service.HotelCommentService;
import org.dh.hotel.util.BeanMapper;
import org.dh.hotel.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "HotelCommentController")
@RequestMapping("/hotelComment")
public class HotelCommentController {

    private final HotelCommentService hotelCommentService;

    @Autowired
    public HotelCommentController(HotelCommentService hotelCommentService) {
        this.hotelCommentService = hotelCommentService;
    }

    @ApiOperation(value = "获取全部留言", notes = "获取全部留言", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid HotelCommentA01InputDTO input){
        JSONResult<List<HotelCommentA01DTO>> jsonResult = new JSONResult<>();

        int page = input.getPage() == null ? 1 : input.getPage();
        int pageSize = input.getPageSize() == null ? 10 : input.getPageSize();

        HashMap<String, Object> params = new HashMap<>();
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("offset", (page - 1) * pageSize);
        List<HotelCommentA01DTO> hotelCommentA01DTOS = BeanMapper.mapList(hotelCommentService.getAllHotelComment(params),HotelCommentA01DTO.class);

        // 数据返回值
        jsonResult.setData(hotelCommentA01DTOS);
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setTotalCount(hotelCommentService.countAllHotelComment(params));
        return jsonResult;
    }

    @ApiOperation(value = "删除留言", notes = "删除留言", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody HotelCommentA02InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();

        boolean flag  = hotelCommentService.deleteByPrimaryKey(input.getId());
        jsonResult.setMessage(flag? "删除成功" : "删除失败");
        return jsonResult;
    }

    @ApiOperation(value = "添加留言", notes = "添加留言", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody HotelCommentA03InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();
        HotelComment hotelComment = BeanMapper.map(input,HotelComment.class);
        boolean flag  = hotelCommentService.insert(hotelComment);
        jsonResult.setMessage(flag? "添加成功" : "添加失败");
        return jsonResult;
    }

}
