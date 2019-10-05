package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dh.hotel.entity.dto.HotelOrder.HotelOrderA01DTO;
import org.dh.hotel.entity.entity.HotelOrder;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface HotelOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelOrder record);

    int insertSelective(HotelOrder record);

    HotelOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelOrder record);

    int updateByPrimaryKey(HotelOrder record);

    List<HotelOrder> getAllHotelOrder(HashMap<String, Object> params);

    Integer countAllHotelOrder(HashMap<String, Object> params);

}