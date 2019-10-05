package org.dh.hotel.entity.entity;

import java.util.Date;

public class HotelComment {
    private Integer id;

    private Integer uerId;

    private String commentContent;

    private Date commentTime;

    public HotelComment(Integer id, Integer uerId, String commentContent, Date commentTime) {
        this.id = id;
        this.uerId = uerId;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
    }

    public HotelComment() {
        super();
    }

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

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}