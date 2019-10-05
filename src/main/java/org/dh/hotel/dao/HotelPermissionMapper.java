package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dh.hotel.entity.entity.HotelPermission;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface HotelPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelPermission record);

    int insertSelective(HotelPermission record);

    HotelPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelPermission record);

    int updateByPrimaryKey(HotelPermission record);
}