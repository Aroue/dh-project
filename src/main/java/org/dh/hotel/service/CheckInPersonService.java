package org.dh.hotel.service;

import org.dh.hotel.entity.dto.CheckInPerson.CheckInPersonA01DTO;
import org.dh.hotel.entity.entity.CheckInPerson;

import java.util.HashMap;
import java.util.List;

public interface CheckInPersonService {
    List<CheckInPersonA01DTO> getAllCheckInPerson(HashMap<String, Object> params);

    Integer countAllCheckInPerson(HashMap<String, Object> params);

    boolean deleteByPrimaryKey(Integer id);

    boolean insertSelective(CheckInPerson record);

    List<CheckInPerson> getOrderCheckInPerson(Integer id);

    CheckInPerson selectByPrimaryKey(Integer id);
}
