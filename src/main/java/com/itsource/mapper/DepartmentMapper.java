package com.itsource.mapper;

import com.itsource.domain.Department;

import java.util.List;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.mapper
 * @ClassName:      DepartmentMapper
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
public interface DepartmentMapper extends BaseMapper<Department>{
    /**
     * 得到部门树
     * @return
     */
    List<Department> loadDeptTree();
}