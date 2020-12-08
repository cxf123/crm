package com.itsource.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Role
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private Long id;

    private String sn;

    private String name;
    private List<Permission> permissions = new ArrayList<Permission>();
    private static final long serialVersionUID = 1L;
}