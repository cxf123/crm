package com.itsource.service;

import com.itsource.domain.Department;

import java.util.List;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.service
 * @ClassName:      DepartmentService
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
public interface DepartmentService extends BaseService<Department>{
    List<Department> getDeptTree();


}
