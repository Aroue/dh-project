package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dh.hotel.entity.entity.HotelRoomType;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface HotelRoomTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoomType record);

    int insertSelective(HotelRoomType record);

    HotelRoomType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelRoomType record);

    int updateByPrimaryKey(HotelRoomType record);

    List<HotelRoomType> getAllHotelRoomType(HashMap<String, Object> params);

    Integer countAllHotelRoomType(HashMap<String, Object> params);
}