package org.dh.hotel.entity.entity;

public class HotelUser {
    private Integer id;

    private String phone;

    private String userName;

    private String password;

    private String idNumber;

    public HotelUser(Integer id, String phone, String userName, String password, String idNumber) {
        this.id = id;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.idNumber = idNumber;
    }

    public HotelUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }
}