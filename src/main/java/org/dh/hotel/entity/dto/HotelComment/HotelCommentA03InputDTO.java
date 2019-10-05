package org.dh.hotel.entity.dto.HotelComment;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class HotelCommentA03InputDTO extends RequestDTO {
    @NotNull(message = "用户ID不能为空")
    private Integer uerId;

    @NotNull(message = "内容不能为空")
    private String commentContent;

    @ApiModelProperty(value = "用户ID", name = "uerId", dataType = "Integer")
    public Integer getUerId() {
        return uerId;
    }

    public void setUerId(Integer uerId) {
        this.uerId = uerId;
    }

    @ApiModelProperty(value = "内容", name = "commentContent", dataType = "String")
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
