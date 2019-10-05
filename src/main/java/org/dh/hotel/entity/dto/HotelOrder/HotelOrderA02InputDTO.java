package org.dh.hotel.entity.dto.HotelOrder;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class HotelOrderA02InputDTO extends RequestDTO {
    @NotNull(message = "用户ID不能为空")
    private Integer userId;

    private String orderNote;

    @NotNull(message = "房型ID不能为空")
    private Integer roomTypeId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date checkInTime;

    @ApiModelProperty(value = "用户ID", name = "userId", dataType = "Integer")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @ApiModelProperty(value = "备注", name = "orderNote", dataType = "String")
    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    @ApiModelProperty(value = "房型ID", name = "roomTypeId", dataType = "Integer")
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @ApiModelProperty(value = "入住时间", name = "checkInTime", dataType = "Date")
    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }
}
