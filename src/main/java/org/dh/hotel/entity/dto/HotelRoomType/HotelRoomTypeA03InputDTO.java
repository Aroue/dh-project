package org.dh.hotel.entity.dto.HotelRoomType;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class HotelRoomTypeA03InputDTO extends RequestDTO {
    @NotNull(message = "id不能为空")
    private Integer id;

    @ApiModelProperty(value = "id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
