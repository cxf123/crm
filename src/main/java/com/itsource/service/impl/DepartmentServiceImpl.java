package com.itsource.service.impl;

import com.itsource.domain.Department;
import com.itsource.mapper.DepartmentMapper;
import com.itsource.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.service.impl
 * @ClassName:      DepartmentServiceImpl
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDeptTree() {
        List<Department> departments = departmentMapper.loadDeptTree();

        return departments;
    }
}
