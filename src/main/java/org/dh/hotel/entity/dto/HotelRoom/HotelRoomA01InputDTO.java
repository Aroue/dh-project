package org.dh.hotel.entity.dto.HotelRoom;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

public class HotelRoomA01InputDTO extends RequestDTO {

    private Integer roomTypeId;

    private String homeState;

    private Integer page;

    private Integer pageSize;


    @ApiModelProperty(value = "房型ID", name = "roomTypeId", dataType = "Integer")
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @ApiModelProperty(value = "房间状态", name = "homeState", dataType = "String")
    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    /**
     * 获取 当前页
     * @return page 当前页
     */
    @ApiModelProperty(value = "当前页", name = "page", dataType = "Integer")
    public Integer getPage() {
        return page;
    }

    /**
     * 设置 当前页
     * @param page 当前页
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取 分页大小
     * @return pageSize 分页大小
     */
    @ApiModelProperty(value = "分页大小", name = "pageSize", dataType = "Integer")
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置 分页大小
     * @param pageSize 分页大小
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
