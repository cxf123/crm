package com.itsource.service.impl;

import com.itsource.domain.Employee;
import com.itsource.domain.EmployeeRole;
import com.itsource.domain.Role;
import com.itsource.mapper.EmployeeMapper;
import com.itsource.service.EmployeeService;
import com.itsource.util.MD5Util;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.itsource.service.impl
 * @ClassName: EmployeeServiceImpl
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/2 23:24
 * @Version: 1.0
 */
@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getDeptTree() {

        return null;
    }
    @Override
    public void add(Employee employee){
        String encrypt = MD5Util.encrypt(employee.getPassword());
        employee.setPassword(encrypt);
        super.add(employee);
        ArrayList<EmployeeRole> employeeRoles = new ArrayList<>();
        List<Role> roles = employee.getRoles();
        if (CollectionUtils.isEmpty(roles)) {
            for (Role role : roles) {
                employeeRoles.add(new EmployeeRole(employee.getId(),role.getId()));
            }
        }
        employeeMapper.saveEmployeeRole(employeeRoles);
    }

        @Override
    public Employee login(String username) {
            Employee login = employeeMapper.login(username);
            return login;
    }

    @Override
    public Employee getBackPassword(String email) {
        Employee backPassword = employeeMapper.getBackPassword(email);
        return backPassword;
    }

    @Override
    public void leave(Long id) {
        employeeMapper.leave(id);
    }

    @Override
    public void batchAdd(Object obj) {

    }

    @Override
    public List<String[]> importXlsx(InputStream stream) throws Exception {
        //准备集合
        ArrayList<String[]> list = new ArrayList<>();
        XSSFWorkbook xssfSheets = new XSSFWorkbook(stream);
        XSSFSheet sheetAt = xssfSheets.getSheetAt(0);
        int lastRowNum = sheetAt.getLastRowNum();
        for (int i = 1; i <= lastRowNum; i++) {
            // 获取行;
            XSSFRow row = sheetAt.getRow(i);
            // 获取所有列;
            short cellNum = row.getLastCellNum();
            // 创建行数组:一行的长度就是最大列数;
            String[] strs = new String[cellNum];
            // 遍历所有列:取出列,存值;
            for (int j = 0; j < cellNum; j++) {
                // 获得列对象;
                XSSFCell cell = row.getCell(j);
                // 往行里面的列存取数据;
                strs[j] = cell.getStringCellValue();
            }
            // 把每行添加进集合;
            list.add(strs);
        }

        return list;

    }
}
