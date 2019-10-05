package org.dh.hotel.entity.dto.CheckInPerson;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class CheckInPersonA03InputDTO extends RequestDTO {
    @NotNull(message = "姓名不能为空")
    private String name;

    @NotNull(message = "身份证号码不能为空")
    private String idNumber;

    @NotNull(message = "房间号不能为空")
    private Integer roomId;

    @NotNull(message = "订单ID不能为空")
    private Integer orderId;

    private String checkInPersonPhone;

    @ApiModelProperty(value = "分页大小", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "身份证号", name = "idNumber", dataType = "String")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @ApiModelProperty(value = "房间ID", name = "roomId", dataType = "Integer")
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @ApiModelProperty(value = "订单ID", name = "orderId", dataType = "Integer")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @ApiModelProperty(value = "电话号码", name = "checkInPersonPhone", dataType = "String")
    public String getCheckInPersonPhone() {
        return checkInPersonPhone;
    }

    public void setCheckInPersonPhone(String checkInPersonPhone) {
        this.checkInPersonPhone = checkInPersonPhone;
    }
}
