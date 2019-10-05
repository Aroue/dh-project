package org.dh.hotel.serviceImpl;

import org.dh.hotel.dao.HotelCommentMapper;
import org.dh.hotel.entity.entity.HotelComment;
import org.dh.hotel.service.HotelCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Component
@Transactional
public class HotelCommentServiceImpl implements HotelCommentService {
    private final HotelCommentMapper hotelCommentMapper;

    @Autowired
    public HotelCommentServiceImpl(HotelCommentMapper hotelCommentMapper) {
        this.hotelCommentMapper = hotelCommentMapper;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return hotelCommentMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public List<HotelComment> getAllHotelComment(HashMap<String, Object> params) {
        return hotelCommentMapper.getAllHotelComment(params);
    }

    @Override
    public boolean insert(HotelComment record) {
        return hotelCommentMapper.insert(record) > 0;
    }

    @Override
    public Integer countAllHotelComment(HashMap<String, Object> params) {
        return hotelCommentMapper.countAllHotelComment(params);
    }
}
