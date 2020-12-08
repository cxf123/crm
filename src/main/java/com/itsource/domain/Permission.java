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
}