package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dh.hotel.entity.entity.HotelAdministrator;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface HotelAdministratorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelAdministrator record);

    int insertSelective(HotelAdministrator record);

    HotelAdministrator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelAdministrator record);

    int updateByPrimaryKey(HotelAdministrator record);
}