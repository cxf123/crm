package com.itsource.controller;


import com.itsource.annotation.OwnPermission;
import com.itsource.domain.Department;
import com.itsource.query.DepartmentQuery;
import com.itsource.service.DepartmentService;
import com.itsource.util.AjaxResult;
import com.itsource.util.PageList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

	/**
	 * 控制层
	 */
	@RequestMapping("/index")
	@OwnPermission("部门管理")
	public String index() {
		System.out.println("测试一波...");
		return "/department/department";
	}

	@GetMapping("/list")
	@OwnPermission("部门列表")
	public PageList<Department> list(@RequestBody DepartmentQuery departmentQuery) {
		logger.info(departmentQuery.toString());
		return departmentService.findByQuery(departmentQuery);
	}


	@DeleteMapping("/del/{id}")
	@OwnPermission("部门删除")
	public AjaxResult del(@PathVariable Long id) {
		System.out.println("删除走一波...");
		try {
			departmentService.delete(id);
			return new AjaxResult();
		} catch (Exception e) {
			e.printStackTrace();
			return new AjaxResult("删除失败!" + e.getMessage());
		}

	}
	
	@PostMapping ("/save")
	@OwnPermission("部门保存")
	public AjaxResult save(@RequestBody Department department) {
		System.out.println("保存走一波...");
		try {
			//ID不为空就更新
			if(department.getId()!=null){
				departmentService.update(department);
			}else{
				//为空添加
				departmentService.add(department);
			}
			return new AjaxResult();
		} catch (Exception e) {
			e.printStackTrace();
			return new AjaxResult("操作失败!" + e.getMessage());
		}

	}
	
	/**
	 * 加载部门树
	 */
	@RequestMapping("/loadDeptTree")
	@ResponseBody
	public List<Department> loadDeptTree() {
		
		return departmentService.getDeptTree();
	

	}
}
