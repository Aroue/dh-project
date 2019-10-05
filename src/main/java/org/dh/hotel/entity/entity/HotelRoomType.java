package org.dh.hotel.entity.entity;

public class HotelRoomType {
    private Integer id;

    private String name;

    private Integer price;

    private Integer beds;

    private String introduction;

    public HotelRoomType(Integer id, String name, Integer price, Integer beds, String introduction) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.beds = beds;
        this.introduction = introduction;
    }

    public HotelRoomType() {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}