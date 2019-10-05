package org.dh.hotel.entity.entity;

public class CheckInPerson {
    private Integer id;

    private String name;

    private String idNumber;

    private Integer roomId;

    private Integer orderId;

    private String checkInPersonPhone;

    public CheckInPerson(Integer id, String name, String idNumber, Integer roomId, Integer orderId, String checkInPersonPhone) {
        this.id = id;
        this.name = name;
        this.idNumber = idNumber;
        this.roomId = roomId;
        this.orderId = orderId;
        this.checkInPersonPhone = checkInPersonPhone;
    }

    public CheckInPerson() {
        super();
    }

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
        this.name = name == null ? null : name.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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
        this.checkInPersonPhone = checkInPersonPhone == null ? null : checkInPersonPhone.trim();
    }
}