package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dh.hotel.entity.dto.CheckInPerson.CheckInPersonA01DTO;
import org.dh.hotel.entity.entity.CheckInPerson;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface CheckInPersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckInPerson record);

    int insertSelective(CheckInPerson record);

    CheckInPerson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckInPerson record);

    int updateByPrimaryKey(CheckInPerson record);

    List<CheckInPersonA01DTO> getAllCheckInPerson(HashMap<String, Object> params);

    List<CheckInPerson> getOrderCheckInPerson(Integer id);

    Integer countAllCheckInPerson(HashMap<String, Object> params);
}