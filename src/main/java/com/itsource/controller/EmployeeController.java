package com.itsource.controller;

import com.itsource.annotation.OwnPermission;
import com.itsource.domain.Employee;
import com.itsource.query.EmployeeQuery;
import com.itsource.service.EmployeeService;
import com.itsource.util.AjaxResult;
import com.itsource.util.PageList;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ProjectName: crm
 * @Package: com.itsource.controller
 * @ClassName: EmployeeController
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/3 22:31
 * @Version: 1.0
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    /**
     * 控制层
     */
    @RequestMapping("/index")
    @OwnPermission("员工管理")
    public String index() {
        return "/employee/employee";
    }
    @GetMapping("/list")
    @OwnPermission("员工列表")
    public PageList<Employee>list(EmployeeQuery employeeQuery) {
        PageList<Employee> byQuery = employeeService.findByQuery(employeeQuery);
        return byQuery;
    }
    @PostMapping("/save")
    @OwnPermission("员工添加")
    public AjaxResult save(@RequestBody Employee employee){
        if (employee.getId() == null) {
            employeeService.add(employee);
        }
        employeeService.update(employee);
        return  new AjaxResult();
    }
}
