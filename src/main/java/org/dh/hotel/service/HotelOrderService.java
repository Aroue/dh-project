package org.dh.hotel.service;

import org.dh.hotel.entity.dto.HotelOrder.HotelOrderA01DTO;
import org.dh.hotel.entity.entity.HotelOrder;

import java.util.HashMap;
import java.util.List;

public interface HotelOrderService {
    List<HotelOrder> getAllHotelOrder(HashMap<String, Object> params);

    Integer countAllHotelOrder(HashMap<String, Object> params);

    boolean insertSelective(HotelOrder record);

    HotelOrder selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(HotelOrder record);

    boolean deleteByPrimaryKey(Integer id);
}
