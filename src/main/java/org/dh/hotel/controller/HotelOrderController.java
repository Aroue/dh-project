package org.dh.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dh.hotel.entity.dto.HotelOrder.*;
import org.dh.hotel.entity.entity.HotelOrder;
import org.dh.hotel.entity.entity.HotelRoom;
import org.dh.hotel.service.HotelOrderService;
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
@Api(tags = "HotelOrderController")
@RequestMapping("/hotelOrder")
public class HotelOrderController {
    @Autowired
    private HotelOrderService hotelOrderService;

    @Autowired
    private HotelRoomService hotelRoomService;

    @ApiOperation(value = "获取全部订单", notes = "获取全部订单", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid HotelOrderA01InputDTO input) {
        JSONResult<List<HotelOrderA01DTO>> jsonResult = new JSONResult<>();

        int page = input.getPage() == null ? 1 : input.getPage();
        int pageSize = input.getPageSize() == null ? 10 : input.getPageSize();

        HashMap<String, Object> params = new HashMap<>();
        params.put("roomTypeId", input.getRoomTypeId());
        params.put("userId", input.getRoomTypeId());
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("offset", (page - 1) * pageSize);
        List<HotelOrderA01DTO> hotelOrderA01DTOList = BeanMapper.mapList(hotelOrderService.getAllHotelOrder(params), HotelOrderA01DTO.class);

        // 数据返回值
        jsonResult.setData(hotelOrderA01DTOList);
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setTotalCount(hotelOrderService.countAllHotelOrder(params));
        return jsonResult;
    }

    @ApiOperation(value = "添加订单", notes = "添加订单", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody HotelOrderA02InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();
        HotelOrder hotelOrder = BeanMapper.map(input, HotelOrder.class);
        hotelOrder.setOrderState(1);

        boolean flag = hotelOrderService.insertSelective(hotelOrder);
        jsonResult.setMessage(flag ? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取订单信息", notes = "获取订单信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A03")
    public JSONResult A03(@Valid HotelOrderA03InputDTO input) {
        JSONResult<HotelOrder> jsonResult = new JSONResult<>();

        HotelOrder hotelOrder = BeanMapper.map(hotelOrderService.selectByPrimaryKey(input.getId()), HotelOrder.class);
        jsonResult.setData(hotelOrder);

        return jsonResult;
    }

    @ApiOperation(value = "更新订单信息", notes = "更新订单信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody HotelOrderA04InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();
        HotelOrder hotelOrder = BeanMapper.map(input, HotelOrder.class);

        boolean flag = hotelOrderService.updateByPrimaryKeySelective(hotelOrder);
        if (flag) {
            if (input.getOrderState() == 2) {
                HotelRoom hotelRoom = new HotelRoom();
                hotelRoom.setId(input.getRoomId());
                hotelRoom.setHomeState("已入住");
                hotelRoomService.updateByPrimaryKeySelective(hotelRoom);
            }
            if (input.getOrderState() == 3 || input.getOrderState() == 1) {
                HotelRoom hotelRoom = new HotelRoom();
                hotelRoom.setId(input.getRoomId());
                hotelRoom.setHomeState("空闲");
                hotelRoomService.updateByPrimaryKeySelective(hotelRoom);
            }
        }

        jsonResult.setMessage(flag ? "修改成功" : "修改失败");
        return jsonResult;
    }

    @ApiOperation(value = "删除订单信息", notes = "删除订单信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody HotelOrderA03InputDTO input) {
        JSONResult<HotelOrder> jsonResult = new JSONResult<>();
        boolean flag = hotelOrderService.deleteByPrimaryKey(input.getId());
        jsonResult.setMessage(flag? "删除成功" : "删除失败");
        return jsonResult;
    }

}
