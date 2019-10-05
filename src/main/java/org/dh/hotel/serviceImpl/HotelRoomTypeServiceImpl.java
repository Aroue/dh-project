package org.dh.hotel.serviceImpl;

import org.dh.hotel.dao.HotelRoomTypeMapper;
import org.dh.hotel.entity.entity.HotelRoomType;
import org.dh.hotel.service.HotelRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Component
@Transactional
public class HotelRoomTypeServiceImpl implements HotelRoomTypeService {
    private final HotelRoomTypeMapper hotelRoomTypeMapper;

    @Autowired
    public HotelRoomTypeServiceImpl(HotelRoomTypeMapper hotelRoomTypeMapper) {
        this.hotelRoomTypeMapper = hotelRoomTypeMapper;
    }

    @Override
    public List<HotelRoomType> getAllHotelRoomType(HashMap<String, Object> params) {
        return hotelRoomTypeMapper.getAllHotelRoomType(params);
    }

    @Override
    public boolean insertHotelRoomType(HotelRoomType hotelRoomType) {
        return hotelRoomTypeMapper.insert(hotelRoomType) > 0;
    }

    @Override
    public boolean updateHotelRoomType(HotelRoomType hotelRoomType) {
        return hotelRoomTypeMapper.updateByPrimaryKeySelective(hotelRoomType) > 0;
    }

    @Override
    public boolean deleteHotelRoomType(Integer id) {
        return hotelRoomTypeMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public HotelRoomType selectByPrimaryKey(Integer id) {
        return hotelRoomTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer countAllHotelRoomType(HashMap<String, Object> params) {
        return hotelRoomTypeMapper.countAllHotelRoomType(params);
    }
}
