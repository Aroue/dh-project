package org.dh.hotel.entity.entity;

public class HotelPermission {
    private Integer id;

    private String name;

    private String introduction;

    public HotelPermission(Integer id, String name, String introduction) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
    }

    public HotelPermission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}