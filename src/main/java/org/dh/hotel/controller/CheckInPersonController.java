package org.dh.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dh.hotel.entity.dto.CheckInPerson.*;
import org.dh.hotel.entity.entity.CheckInPerson;
import org.dh.hotel.service.CheckInPersonService;
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
@Api(tags = "CheckInPersonController")
@RequestMapping("/checkInPerson")
public class CheckInPersonController {
    private final CheckInPersonService checkInPersonService;

    @Autowired
    public CheckInPersonController(CheckInPersonService checkInPersonService) {
        this.checkInPersonService = checkInPersonService;
    }

    @ApiOperation(value = "获取全部入住人", notes = "获取全部入住人", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid CheckInPersonA01InputDTO input){
        JSONResult<List<CheckInPersonA01DTO>> jsonResult = new JSONResult<>();

        int page = input.getPage() == null ? 1 : input.getPage();
        int pageSize = input.getPageSize() == null ? 10 : input.getPageSize();

        HashMap<String, Object> params = new HashMap<>();
        params.put("name", input.getName());
        params.put("idNumber", input.getIdNumber());
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("offset", (page - 1) * pageSize);
        List<CheckInPersonA01DTO> checkInPersonA01DTOS = BeanMapper.mapList(checkInPersonService.getAllCheckInPerson(params),CheckInPersonA01DTO.class);

        // 数据返回值
        jsonResult.setData(checkInPersonA01DTOS);
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setTotalCount(checkInPersonService.countAllCheckInPerson(params));
        return jsonResult;
    }

    @ApiOperation(value = "删除入住人", notes = "删除入住人", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody CheckInPersonA02InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();

        boolean flag  = checkInPersonService.deleteByPrimaryKey(input.getId());
        jsonResult.setMessage(flag? "删除成功" : "删除失败");
        return jsonResult;
    }

    @ApiOperation(value = "添加入住人", notes = "添加入住人", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody CheckInPersonA03InputDTO input) {
        JSONResult jsonResult = new JSONResult<>();
        CheckInPerson checkInPerson  = BeanMapper.map(input, CheckInPerson.class);
        boolean flag  = checkInPersonService.insertSelective(checkInPerson);
        jsonResult.setMessage(flag? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取订单入住人", notes = "获取订单入住人", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A04")
    public JSONResult A04(@Valid CheckInPersonA04InputDTO input) {
        JSONResult< List<CheckInPerson>> jsonResult = new JSONResult<>();
        List<CheckInPerson> checkInPersonList  = BeanMapper.mapList(checkInPersonService.getOrderCheckInPerson(input.getId()), CheckInPerson.class);

        jsonResult.setData(checkInPersonList);
        return jsonResult;
    }

    @ApiOperation(value = "获取入住人信息", notes = "获取入住人信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A05")
    public JSONResult A05(@Valid CheckInPersonA04InputDTO input) {
        JSONResult<CheckInPerson> jsonResult = new JSONResult<>();
        CheckInPerson checkInPerson = BeanMapper.map(checkInPersonService.selectByPrimaryKey(input.getId()),CheckInPerson.class);
        jsonResult.setData(checkInPerson);
        return jsonResult;
    }
}
