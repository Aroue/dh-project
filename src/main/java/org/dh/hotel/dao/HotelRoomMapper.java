package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dh.hotel.entity.dto.HotelRoom.HotelRoomA01DTO;
import org.dh.hotel.entity.entity.HotelRoom;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface HotelRoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoom record);

    int insertSelective(HotelRoom record);

    HotelRoom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelRoom record);

    int updateByPrimaryKey(HotelRoom record);

    List<HotelRoomA01DTO> getAllHotelRoom(HashMap<String, Object> params);

    Integer countAllHotelRoom(HashMap<String, Object> params);
}