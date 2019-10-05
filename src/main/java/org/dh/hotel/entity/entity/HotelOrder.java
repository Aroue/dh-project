package org.dh.hotel.entity.entity;

import java.util.Date;

public class HotelOrder {
    private Integer id;

    private Integer userId;

    private String orderNote;

    private Date createdTime;

    private Integer roomTypeId;

    private Integer roomId;

    private Date checkInTime;

    /**
     * 1: 已预订、2: 已入住、3:已完成
     */
    private Integer orderState;

    public HotelOrder(Integer id, Integer userId, String orderNote, Date createdTime, Integer roomTypeId, Integer roomId, Date checkInTime, Integer orderState) {
        this.id = id;
        this.userId = userId;
        this.orderNote = orderNote;
        this.createdTime = createdTime;
        this.roomTypeId = roomTypeId;
        this.roomId = roomId;
        this.checkInTime = checkInTime;
        this.orderState = orderState;
    }

    public HotelOrder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote == null ? null : orderNote.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}