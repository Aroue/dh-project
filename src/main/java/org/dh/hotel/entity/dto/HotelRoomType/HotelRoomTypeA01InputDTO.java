package org.dh.hotel.entity.dto.HotelRoomType;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

public class HotelRoomTypeA01InputDTO extends RequestDTO {
    private String name;

    private Integer lowPrice;

    private Integer highPrice;

    private Integer beds;

    private String introduction;

    private Integer page;

    private Integer pageSize;

    @ApiModelProperty(value = "房型名称", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "最低价格", name = "lowPrice", dataType = "Integer")
    public Integer getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Integer lowPrice) {
        this.lowPrice = lowPrice;
    }

    @ApiModelProperty(value = "最高价格", name = "highPrice", dataType = "Integer")
    public Integer getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Integer highPrice) {
        this.highPrice = highPrice;
    }

    @ApiModelProperty(value = "房型床位数", name = "beds", dataType = "Integer")
    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    @ApiModelProperty(value = "房型介绍", name = "introduction", dataType = "String")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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
