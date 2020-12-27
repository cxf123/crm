package com.itsource.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Permission
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission implements Serializable {
    private Long id;

    private String name;

    private String sn;

    private String resource;

    private Long state;

    private Systemmenu menu;

    private static final long serialVersionUID = 1L;

    public Permission(String name, String sn, String resource) {
        this.name = name;
        this.sn = sn;
        this.resource = resource;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Systemmenu getMenu() {
        return menu;
    }

    public void setMenu(Systemmenu menu) {
        this.menu = menu;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}