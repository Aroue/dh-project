package org.dh.hotel.entity.dto.HotelUser;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

public class HotelUserA01InputDTO extends RequestDTO {

    private String phone;

    private String userName;

    private String idNumber;
    /**
     * 当前页
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;

    @ApiModelProperty(value = "电话号码", name = "phone", dataType = "String")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @ApiModelProperty(value = "用户名", name = "userName", dataType = "String")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @ApiModelProperty(value = "身份证号码", name = "idNumber", dataType = "String")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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
