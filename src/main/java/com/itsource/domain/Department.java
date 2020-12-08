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
 * @ClassName:      Department
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private Long id;

    private String sn;

    private String name;

    private String dirpath;

    private Integer state;

    private Employee manager;
    private Department parent;
    private List<Department> children = new ArrayList<>();
    private static final long serialVersionUID = 1L;
}