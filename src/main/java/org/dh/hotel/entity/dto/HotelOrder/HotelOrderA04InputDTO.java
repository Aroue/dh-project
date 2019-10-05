package org.dh.hotel.entity.dto.HotelOrder;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class HotelOrderA04InputDTO extends RequestDTO {
    @NotNull(message = "ID不能为空")
    private Integer id;

    private String orderNote;

    @NotNull(message = "房型ID不能为空")
    private Integer roomTypeId;

    private Integer roomId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date checkInTime;

    /**
     * 1: 已预订、2: 已入住、3:已完成
     */
    private Integer orderState;

    @ApiModelProperty(value = "id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @ApiModelProperty(value = "房间ID", name = "roomId", dataType = "Integer")
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    @ApiModelProperty(value = "入住时间", name = "checkInTime", dataType = "Date")
    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    @ApiModelProperty(value = "订单状态", name = "orderState", dataType = "Integer")
    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}
