package org.dh.hotel.service;

import org.dh.hotel.entity.entity.HotelRoomType;

import java.util.HashMap;
import java.util.List;

public interface HotelRoomTypeService {
    /**
     * 获取所有房型
     * @return
     */
    List<HotelRoomType> getAllHotelRoomType(HashMap<String, Object> params);

    /**
     * 添加房型
     * @return
     */
    boolean insertHotelRoomType(HotelRoomType hotelRoomType);

    /**
     * 修改房型
     * @param hotelRoomType
     * @return
     */
    boolean updateHotelRoomType(HotelRoomType hotelRoomType);

    /**
     * 删除房型
     * @param id
     * @return
     */
    boolean deleteHotelRoomType(Integer id);


    /**
     * 获取房型信息
     * @param id
     * @return
     */
    HotelRoomType selectByPrimaryKey(Integer id);

    Integer countAllHotelRoomType(HashMap<String, Object> params);
}
