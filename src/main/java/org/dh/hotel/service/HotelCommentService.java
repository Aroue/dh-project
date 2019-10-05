package org.dh.hotel.service;

import org.dh.hotel.entity.entity.HotelComment;

import java.util.HashMap;
import java.util.List;

public interface HotelCommentService {
    /**
     * 删除留言
     * @param id
     * @return
     */
    boolean deleteByPrimaryKey(Integer id);

    /**
     * 获取全部留言
     * @return
     */
    List<HotelComment> getAllHotelComment(HashMap<String, Object> params);


    /**
     * 添加留言
     * @param record
     * @return
     */
    boolean insert(HotelComment record);

    Integer countAllHotelComment(HashMap<String, Object> params);
}
