package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dh.hotel.entity.dto.HotelUser.HotelUserA01InputDTO;
import org.dh.hotel.entity.entity.HotelUser;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface HotelUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelUser record);

    int insertSelective(HotelUser record);

    HotelUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelUser record);

    int updateByPrimaryKey(HotelUser record);

    List<HotelUser> getAllHotelUser(HashMap<String, Object> params);

    Integer countAllHotelUser(HashMap<String, Object> params);

    HotelUser login(HashMap<String, Object> params);
}