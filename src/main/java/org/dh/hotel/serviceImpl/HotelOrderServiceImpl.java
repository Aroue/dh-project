package org.dh.hotel.serviceImpl;

import org.dh.hotel.dao.HotelOrderMapper;
import org.dh.hotel.entity.dto.HotelOrder.HotelOrderA01DTO;
import org.dh.hotel.entity.entity.HotelOrder;
import org.dh.hotel.service.HotelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Component
@Transactional
public class HotelOrderServiceImpl implements HotelOrderService {
    @Autowired
    private HotelOrderMapper hotelOrderMapper;

    @Override
    public List<HotelOrder> getAllHotelOrder(HashMap<String, Object> params) {
        return hotelOrderMapper.getAllHotelOrder(params);
    }

    @Override
    public Integer countAllHotelOrder(HashMap<String, Object> params) {
        return hotelOrderMapper.countAllHotelOrder(params);
    }

    @Override
    public boolean insertSelective(HotelOrder record) {
        return hotelOrderMapper.insertSelective(record) > 0;
    }

    @Override
    public HotelOrder selectByPrimaryKey(Integer id) {
        return hotelOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(HotelOrder record) {
        return hotelOrderMapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return hotelOrderMapper.deleteByPrimaryKey(id) > 0;
    }
}
