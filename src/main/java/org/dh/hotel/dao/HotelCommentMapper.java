package org.dh.hotel.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dh.hotel.entity.entity.HotelComment;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Mapper
@Component
public interface HotelCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelComment record);

    int insertSelective(HotelComment record);

    HotelComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelComment record);

    int updateByPrimaryKey(HotelComment record);

    List<HotelComment> getAllHotelComment(HashMap<String, Object> params);

    Integer countAllHotelComment(HashMap<String, Object> params);
}