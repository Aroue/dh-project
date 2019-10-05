package org.dh.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dh.hotel.entity.dto.HotelRoomType.HotelRoomTypeA01InputDTO;
import org.dh.hotel.entity.dto.HotelRoomType.HotelRoomTypeA02InputDTO;
import org.dh.hotel.entity.dto.HotelRoomType.HotelRoomTypeA03InputDTO;
import org.dh.hotel.entity.dto.HotelRoomType.HotelRoomTypeA04InputDTO;
import org.dh.hotel.entity.entity.HotelRoomType;
import org.dh.hotel.service.HotelRoomTypeService;
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
@Api(tags = "HotelRoomTypeController")
@RequestMapping("/hotelRoomType")
public class HotelRoomTypeController {

    private final HotelRoomTypeService hotelRoomTypeService;

    @Autowired
    public HotelRoomTypeController(HotelRoomTypeService hotelRoomTypeService) {
        this.hotelRoomTypeService = hotelRoomTypeService;
    }

    @ApiOperation(value = "获取全部房型", notes = "获取全部房型", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid HotelRoomTypeA01InputDTO input){
        JSONResult<List<HotelRoomType>> jsonResult = new JSONResult<>();

        int page = input.getPage() == null ? 1 : input.getPage();
        int pageSize = input.getPageSize() == null ? 10 : input.getPageSize();

        HashMap<String, Object> params = new HashMap<>();;
        params.put("beds", input.getBeds());
        params.put("name", input.getName());
        params.put("lowPrice", input.getLowPrice());
        params.put("highPrice", input.getHighPrice());
        params.put("introduction", input.getIntroduction());
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("offset", (page - 1) * pageSize);
        List<HotelRoomType> hotelRoomTypeList = BeanMapper.mapList(hotelRoomTypeService.getAllHotelRoomType(params),HotelRoomType.class);

        // 数据返回值
        jsonResult.setData(hotelRoomTypeList);
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setTotalCount(hotelRoomTypeService.countAllHotelRoomType(params));
        return jsonResult;
    }

    @ApiOperation(value = "添加房型", notes = "添加房型", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody HotelRoomTypeA02InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();
        HotelRoomType hotelRoomType = BeanMapper.map(input,HotelRoomType.class);

        boolean flag  = hotelRoomTypeService.insertHotelRoomType(hotelRoomType);
        jsonResult.setMessage(flag? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取房型信息", notes = "获取房型信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    public JSONResult A03(@Valid HotelRoomTypeA03InputDTO input) {
        JSONResult<HotelRoomType> jsonResult = new JSONResult<>();

        HotelRoomType hotelRoomType  = hotelRoomTypeService.selectByPrimaryKey(input.getId());
        jsonResult.setData(hotelRoomType);
        return jsonResult;
    }

    @ApiOperation(value = "修改房型信息", notes = "修改房型信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody HotelRoomTypeA04InputDTO input) {
        JSONResult<HotelRoomType> jsonResult = new JSONResult<>();
        HotelRoomType hotelRoomType = BeanMapper.map(input,HotelRoomType.class);

        boolean flag  = hotelRoomTypeService.updateHotelRoomType(hotelRoomType);
        jsonResult.setMessage(flag? "修改成功" : "修改失败");
        return jsonResult;
    }

    @ApiOperation(value = "删除房型", notes = "删除房型", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody HotelRoomTypeA03InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();

        boolean flag  = hotelRoomTypeService.deleteHotelRoomType(input.getId());
        jsonResult.setMessage(flag? "删除成功" : "删除失败");
        return jsonResult;
    }

}
