package org.dh.hotel.entity.dto.CheckInPerson;

import io.swagger.annotations.ApiModelProperty;
import org.dh.hotel.util.dto.RequestDTO;

public class CheckInPersonA01InputDTO extends RequestDTO {

    private String name;

    private String idNumber;
    /**
     * 当前页
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;



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

    @ApiModelProperty(value = "姓名", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "身份证号", name = "idNumber", dataType = "String")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
