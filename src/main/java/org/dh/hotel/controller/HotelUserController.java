package org.dh.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.dh.hotel.entity.dto.HotelUser.*;
import org.dh.hotel.entity.entity.HotelUser;
import org.dh.hotel.service.HotelUserService;
import org.dh.hotel.util.BeanMapper;
import org.dh.hotel.util.BusinessException;
import org.dh.hotel.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "HotelUserController")
@RequestMapping("/hotelUser")
public class HotelUserController {

    private final HotelUserService hotelUserService;

    @Autowired
    public HotelUserController(HotelUserService hotelUserService) {
        this.hotelUserService = hotelUserService;
    }

    @ApiOperation(value = "获取全部用户", notes = "获取全部用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid HotelUserA01InputDTO input){
        JSONResult<List<HotelUser>> jsonResult = new JSONResult<>();

        int page = input.getPage() == null ? 1 : input.getPage();
        int pageSize = input.getPageSize() == null ? 10 : input.getPageSize();

        HashMap<String, Object> params = new HashMap<>();;
        params.put("phone", input.getPhone());
        params.put("userName", input.getUserName());
        params.put("idNumber", input.getIdNumber());
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("offset", (page - 1) * pageSize);
        List<HotelUser> hotelUserList = BeanMapper.mapList(hotelUserService.getAllHotelUser(params),HotelUser.class);

        // 数据返回值
        jsonResult.setPage(input.getPage());
        jsonResult.setPageSize(input.getPageSize());
        jsonResult.setTotalCount(hotelUserService.countAllHotelUser(params));
        jsonResult.setData(hotelUserList);
        return jsonResult;
    }

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A02")
    public JSONResult A02(@Valid HotelUserA02InputDTO input){
        JSONResult<HotelUser> jsonResult = new JSONResult<>();
        HotelUser hotelUser = BeanMapper.map(hotelUserService.selectByPrimaryKey(input.getId()),HotelUser.class);

        jsonResult.setData(hotelUser);
        return jsonResult;
    }

    @ApiOperation(value = "修改用户信息", notes = "修改用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody HotelUserA03InputDTO input){
        JSONResult<HotelUser> jsonResult = new JSONResult<>();
        HotelUser hotelUser = BeanMapper.map(input,HotelUser.class);

        boolean flag = hotelUserService.updateByPrimaryKeySelective(hotelUser);

        jsonResult.setMessage(flag ? "修改成功" : "修改失败");
        return jsonResult;
    }

    @ApiOperation(value = "用户登陆", notes = "用户登陆", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody HotelUserA04InputDTO input){
        JSONResult<HotelUser> jsonResult = new JSONResult<>();

        HashMap<String, Object> params = new HashMap<>();;
        params.put("phone", input.getPhone());
        params.put("password", input.getPassword());

        HotelUser hotelUser = hotelUserService.login(params);
        if (hotelUser != null)
            jsonResult.setData(hotelUser);
        else
            throw new BusinessException("账号或者密码错误");
        return jsonResult;
    }

    @ApiOperation(value = "用户注册", notes = "用户注册", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody HotelUserA05InputDTO input){
        JSONResult jsonResult = new JSONResult<>();
        HotelUser hotelUser = BeanMapper.map(input,HotelUser.class);

        boolean flag = hotelUserService.insert(hotelUser);
        jsonResult.setMessage(flag ? "注册成功" : "注册失败");
        return jsonResult;
    }
}
