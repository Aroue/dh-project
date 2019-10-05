package org.dh.hotel.entity.dto.HotelUser;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class HotelUserA03InputDTO extends RequestDTO {

    @NotNull(message = "ID不能为空")
    private Integer id;

    private String phone;

    private String userName;

    private String password;

    private String idNumber;

    @ApiModelProperty(value = "id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ApiModelProperty(value = "电话号码", name = "phone", dataType = "String")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @ApiModelProperty(value = "用户名", name = "userName", dataType = "String")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @ApiModelProperty(value = "密码", name = "password", dataType = "String")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ApiModelProperty(value = "身份证号码", name = "idNumber", dataType = "String")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
