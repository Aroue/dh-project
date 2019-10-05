package org.dh.hotel.service;

import org.dh.hotel.entity.entity.HotelUser;

import java.util.HashMap;
import java.util.List;

public interface HotelUserService {
    /**
     * 获取全部用户
     * @return
     */
    List<HotelUser> getAllHotelUser(HashMap<String, Object> params);

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    HotelUser selectByPrimaryKey(Integer id);

    /**
     * 更新用户信息
     * @param record
     * @return
     */
    boolean updateByPrimaryKeySelective(HotelUser record);

    /**
     * 登陆
     * @param params
     * @return
     */
    HotelUser login(HashMap<String, Object> params);

    Integer countAllHotelUser(HashMap<String, Object> params);

    boolean insert(HotelUser record);
}
