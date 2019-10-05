package org.dh.hotel.serviceImpl;

import org.dh.hotel.dao.HotelUserMapper;
import org.dh.hotel.entity.entity.HotelUser;
import org.dh.hotel.service.HotelUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Component
@Transactional
public class HotelUserServiceImpl implements HotelUserService {
    private final HotelUserMapper hotelUserMapper;

    @Autowired
    public HotelUserServiceImpl(HotelUserMapper hotelUserMapper) {
        this.hotelUserMapper = hotelUserMapper;
    }

    @Override
    public List<HotelUser> getAllHotelUser(HashMap<String, Object> params) {
        return hotelUserMapper.getAllHotelUser(params);
    }

    @Override
    public HotelUser selectByPrimaryKey(Integer id) {
        return hotelUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(HotelUser record) {
        return hotelUserMapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public HotelUser login(HashMap<String, Object> params) {
        return hotelUserMapper.login(params);
    }

    @Override
    public Integer countAllHotelUser(HashMap<String, Object> params) {
        return hotelUserMapper.countAllHotelUser(params);
    }

    @Override
    public boolean insert(HotelUser record) {
        return hotelUserMapper.insertSelective(record) > 0;
    }
}
