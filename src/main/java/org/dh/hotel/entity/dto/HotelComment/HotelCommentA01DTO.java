package org.dh.hotel.entity.dto.HotelComment;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.dh.hotel.util.dto.ResponseDTO;

import java.util.Date;

public class HotelCommentA01DTO extends ResponseDTO {

    private Integer id;

    private Integer uerId;

    private String userName;

    private String commentContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date commentTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUerId() {
        return uerId;
    }

    public void setUerId(Integer uerId) {
        this.uerId = uerId;
    }

    public String getUerName() {
        return userName;
    }

    public void setUerName(String uerName) {
        this.userName = uerName;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
