package org.dh.hotel.serviceImpl;

import org.dh.hotel.dao.HotelRoomMapper;
import org.dh.hotel.entity.dto.HotelRoom.HotelRoomA01DTO;
import org.dh.hotel.entity.entity.HotelRoom;
import org.dh.hotel.service.HotelRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Component
@Transactional
public class HotelRoomServiceImpl implements HotelRoomService {
    private HotelRoomMapper hotelRoomMapper;

    @Autowired
    public HotelRoomServiceImpl(HotelRoomMapper hotelRoomMapper) {
        this.hotelRoomMapper = hotelRoomMapper;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return hotelRoomMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean insertSelective(HotelRoom record) {
        return hotelRoomMapper.insertSelective(record) > 0;
    }

    @Override
    public HotelRoom selectByPrimaryKey(Integer id) {
        return hotelRoomMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(HotelRoom record) {
        return hotelRoomMapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public List<HotelRoomA01DTO> getAllHotelRoom(HashMap<String, Object> params) {
        return hotelRoomMapper.getAllHotelRoom(params);
    }

    @Override
    public Integer countAllHotelRoom(HashMap<String, Object> params) {
        return hotelRoomMapper.countAllHotelRoom(params);
    }
}
