package com.itsource.mapper;

import com.itsource.domain.Employee;
import com.itsource.domain.EmployeeRole;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.mapper
 * @ClassName:      EmployeeMapper
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
public interface EmployeeMapper extends BaseMapper<Employee>{
    // 登录时通过用户名得到用户的方法
    Employee login(String username);

    // 找回密码时通过用户名得到用户信息的方法
    Employee getBackPassword(String email);

    //员工离职;
    void leave(Long id);

    /**
     * 保存中间表
     * @param empRoles
     */
    void saveEmployeeRole(List<EmployeeRole> empRoles);

    /**
     * 根据员工角色删除中间表;
     * @param id
     */
    void removeEmployeeRole(Serializable id);
}