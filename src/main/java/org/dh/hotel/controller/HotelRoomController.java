package org.dh.hotel.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dh.hotel.entity.dto.HotelRoom.*;
import org.dh.hotel.entity.entity.HotelRoom;
import org.dh.hotel.service.HotelRoomService;
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
@Api(tags = "HotelRoomController")
@RequestMapping("/hotelRoom")
public class HotelRoomController {
    private final HotelRoomService hotelRoomService;

    @Autowired
    public HotelRoomController(HotelRoomService hotelRoomService) {
        this.hotelRoomService = hotelRoomService;
    }

    @ApiOperation(value = "获取全部房间", notes = "获取全部房间", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid HotelRoomA01InputDTO input){
        JSONResult<List<HotelRoomA01DTO>> jsonResult = new JSONResult<>();

        int page = input.getPage() == null ? 1 : input.getPage();
        int pageSize = input.getPageSize() == null ? 10 : input.getPageSize();

        HashMap<String, Object> params = new HashMap<>();;
        params.put("roomTypeId", input.getRoomTypeId());
        params.put("homeState", input.getHomeState());
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("offset", (page - 1) * pageSize);
        List<HotelRoomA01DTO> hotelRoomA01DTOList = BeanMapper.mapList(hotelRoomService.getAllHotelRoom(params),HotelRoomA01DTO.class);

        // 数据返回值
        jsonResult.setData(hotelRoomA01DTOList);
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setTotalCount(hotelRoomService.countAllHotelRoom(params));
        return jsonResult;
    }

    @ApiOperation(value = "添加房间", notes = "添加房间", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody HotelRoomA02InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();
        HotelRoom hotelRoom = BeanMapper.map(input,HotelRoom.class);
        hotelRoom.setHomeState("空闲");

        boolean flag  = hotelRoomService.insertSelective(hotelRoom);
        jsonResult.setMessage(flag? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取房型信息", notes = "获取房型信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    public JSONResult A03(@Valid HotelRoomA03InputDTO input) {
        JSONResult<HotelRoom> jsonResult = new JSONResult<>();

        HotelRoom hotelRoom  = hotelRoomService.selectByPrimaryKey(input.getId());
        jsonResult.setData(hotelRoom);
        return jsonResult;
    }

    @ApiOperation(value = "修改房间信息", notes = "修改房间信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody HotelRoomA04InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();
        HotelRoom hotelRoom = BeanMapper.map(input,HotelRoom.class);

        boolean flag  = hotelRoomService.updateByPrimaryKeySelective(hotelRoom);
        jsonResult.setMessage(flag? "修改成功" : "修改失败");
        return jsonResult;
    }

    @ApiOperation(value = "删除房间", notes = "删除房间", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody HotelRoomA03InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();

        boolean flag  = hotelRoomService.deleteByPrimaryKey(input.getId());
        jsonResult.setMessage(flag? "删除成功" : "删除失败");
        return jsonResult;
    }
}
