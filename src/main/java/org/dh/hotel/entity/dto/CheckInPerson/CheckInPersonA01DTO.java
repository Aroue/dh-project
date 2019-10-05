package org.dh.hotel.entity.dto.CheckInPerson;

import org.dh.hotel.util.dto.ResponseDTO;

public class CheckInPersonA01DTO extends ResponseDTO {
    private Integer id;

    private String name;

    private String idNumber;

    private Integer roomId;

    private String roomNumber;

    private String homeState;

    private Integer orderId;

    private String checkInPersonPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCheckInPersonPhone() {
        return checkInPersonPhone;
    }

    public void setCheckInPersonPhone(String checkInPersonPhone) {
        this.checkInPersonPhone = checkInPersonPhone;
    }
}
