package org.dh.hotel.entity.dto.HotelRoomType;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class HotelRoomTypeA02InputDTO {

    @NotNull(message = "名称不能为空")
    private String name;

    @NotNull(message = "价格不能为空")
    private Integer price;

    @NotNull(message = "床位数不能为空")
    private Integer beds;

    @NotNull(message = "介绍不能为空")
    private String introduction;


    @ApiModelProperty(value = "名称", name = "name", dataType = "String")
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

    @ApiModelProperty(value = "介绍", name = "introduction", dataType = "String")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
