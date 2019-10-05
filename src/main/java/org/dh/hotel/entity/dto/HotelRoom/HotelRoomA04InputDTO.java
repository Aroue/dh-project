package org.dh.hotel.entity.dto.HotelRoom;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class HotelRoomA04InputDTO extends RequestDTO {

    @NotNull(message = "ID不能为空")
    private Integer id;

    @NotNull(message = "房型ID不能为空")
    private Integer roomTypeId;

    @NotNull(message = "房间号不能为空")
    private String roomNumber;

    private String remark;

    private String homeState;


    @ApiModelProperty(value = "id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ApiModelProperty(value = "房型ID", name = "roomTypeId", dataType = "Integer")
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @ApiModelProperty(value = "房间号", name = "roomNumber", dataType = "String")
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @ApiModelProperty(value = "备注", name = "remark", dataType = "String")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @ApiModelProperty(value = "房间状态", name = "homeState", dataType = "String")
    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

}
