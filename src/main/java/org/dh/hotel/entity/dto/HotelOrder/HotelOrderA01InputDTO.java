package org.dh.hotel.entity.dto.HotelOrder;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

public class HotelOrderA01InputDTO extends RequestDTO {

    private Integer roomTypeId;

    private Integer userId;
    /**
     * 当前页
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;

    @ApiModelProperty(value = "用户id", name = "userId", dataType = "Integer")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @ApiModelProperty(value = "房型id", name = "roomTypeId", dataType = "Integer")
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
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
