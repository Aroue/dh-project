package org.dh.hotel.entity.dto.HotelUser;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class HotelUserA02InputDTO extends RequestDTO {
    @NotNull(message = "ID不能为空")
    private Integer id;

    @ApiModelProperty(value = "id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
