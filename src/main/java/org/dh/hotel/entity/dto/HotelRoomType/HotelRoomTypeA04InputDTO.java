package org.dh.hotel.entity.dto.HotelRoomType;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class HotelRoomTypeA04InputDTO {
    @NotNull(message = "id不能为空")
    private Integer id;

    private String name;

    private Integer price;

    private Integer beds;

    private String introduction;

    @ApiModelProperty(value = "id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ApiModelProperty(value = "id", name = "id", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "价格", name = "price", dataType = "Integer")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @ApiModelProperty(value = "床位数", name = "beds", dataType = "Integer")
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
}
