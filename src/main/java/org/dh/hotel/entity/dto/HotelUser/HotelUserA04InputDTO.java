package org.dh.hotel.entity.dto.HotelUser;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class HotelUserA04InputDTO extends RequestDTO {
    @NotNull(message = "电话号码不能为空")
    private String phone;

    @NotNull(message = "密码不能为空")
    private String password;

    @ApiModelProperty(value = "电话号码", name = "phone", dataType = "String")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @ApiModelProperty(value = "密码", name = "password", dataType = "String")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
