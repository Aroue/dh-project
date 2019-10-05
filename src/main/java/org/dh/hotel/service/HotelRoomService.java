package org.dh.hotel.service;

import org.dh.hotel.entity.dto.HotelRoom.HotelRoomA01DTO;
import org.dh.hotel.entity.entity.HotelRoom;

import java.util.HashMap;
import java.util.List;

public interface HotelRoomService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insertSelective(HotelRoom record);

    HotelRoom selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(HotelRoom record);

    List<HotelRoomA01DTO> getAllHotelRoom(HashMap<String, Object> params);

    Integer countAllHotelRoom(HashMap<String, Object> params);

}
