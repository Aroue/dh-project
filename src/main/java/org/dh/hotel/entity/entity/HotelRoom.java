package org.dh.hotel.entity.entity;

public class HotelRoom {
    private Integer id;

    private Integer roomTypeId;

    private String roomNumber;

    private String remark;

    private String homeState;

    public HotelRoom(Integer id, Integer roomTypeId, String roomNumber, String remark, String homeState) {
        this.id = id;
        this.roomTypeId = roomTypeId;
        this.roomNumber = roomNumber;
        this.remark = remark;
        this.homeState = homeState;
    }

    public HotelRoom() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState == null ? null : homeState.trim();
    }
}