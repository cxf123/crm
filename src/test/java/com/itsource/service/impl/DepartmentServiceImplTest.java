package com.itsource.service.impl;

import com.itsource.domain.Department;
import com.itsource.domain.Employee;
import com.itsource.query.DepartmentQuery;
import com.itsource.service.DepartmentService;
import com.itsource.util.PageList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: crm
 * @Package: com.itsource.service.impl
 * @ClassName: DepartmentServiceImplTest
 * @Author: cxf
 * @Description:
 * @Date: 2020/11/28 14:54
 * @Version: 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DepartmentServiceImplTest {
    private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImplTest.class);
    @Autowired
    private DepartmentService departmentService;
    @Test
    public void testSave() throws Exception{
        Department department = new Department();
        department.setSn("面包");
        department.setName("面包");
        department.setDirpath("1/3");
        department.setState(0);
        Employee employee = new Employee();
        employee.setId(54L);
        department.setManager(employee);
        Department department1 = new Department();
        department1.setId(55L);
        department.setParent(department1);


        departmentService.add(department);

    }
        @Test
        public void testlist() throws Exception{
            DepartmentQuery departmentQuery = new DepartmentQuery();


            departmentQuery.setManagerId(43L);

            departmentQuery.setPage(1);
            departmentQuery.setRows(5);


            PageList<Department> byQuery = departmentService.findByQuery(departmentQuery);
            logger.info(byQuery.toString());
            System.out.println(byQuery);
        }
    @Test
    public void getDeptTree() {
    }
}