package com.itsource.service;

import com.itsource.domain.Employee;

import java.io.InputStream;
import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.itsource.service
 * @ClassName: EmployeeService
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/2 23:23
 * @Version: 1.0
 */
public interface EmployeeService extends BaseService<Employee>{
    List<Employee> getDeptTree();
    //用作登录的方法,通过传入用户名,获取到员工对象
    Employee  login(String username);
    Employee  getBackPassword(String email);

    //离职
    void leave(Long id);

    //批量插入;
    void batchAdd(Object obj);
    List<String[]> importXlsx(InputStream stream) throws Exception;
}

