package org.dh.hotel.serviceImpl;

import org.dh.hotel.dao.CheckInPersonMapper;
import org.dh.hotel.entity.dto.CheckInPerson.CheckInPersonA01DTO;
import org.dh.hotel.entity.entity.CheckInPerson;
import org.dh.hotel.service.CheckInPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Component
@Transactional
public class CheckInPersonServiceImpl implements CheckInPersonService {
    @Autowired
    private CheckInPersonMapper checkInPersonMapper;
    @Override
    public List<CheckInPersonA01DTO> getAllCheckInPerson(HashMap<String, Object> params) {
        return checkInPersonMapper.getAllCheckInPerson(params);
    }

    @Override
    public Integer countAllCheckInPerson(HashMap<String, Object> params) {
        return checkInPersonMapper.countAllCheckInPerson(params);
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return checkInPersonMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean insertSelective(CheckInPerson record) {
        return checkInPersonMapper.insertSelective(record) > 0;
    }

    @Override
    public List<CheckInPerson> getOrderCheckInPerson(Integer id) {
        return checkInPersonMapper.getOrderCheckInPerson(id);
    }

    @Override
    public CheckInPerson selectByPrimaryKey(Integer id) {
        return checkInPersonMapper.selectByPrimaryKey(id);
    }
}
