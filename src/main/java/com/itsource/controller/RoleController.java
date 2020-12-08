package com.itsource.controller;

import com.itsource.domain.Role;
import com.itsource.query.RoleQuery;
import com.itsource.service.RoleService;
import com.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.itsource.controller
 * @ClassName: RoleController
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/5 13:09
 * @Version: 1.0
 */
@RequestMapping("/role")
@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("/list")
    public ResponseEntity<List<Role>> list(){
        List<Role> all = roleService.getAll();
        if (CollectionUtils.isEmpty(all)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(all);
    }
    @PostMapping("/savaAndUpdate")
    public ResponseEntity<Void> save(@RequestBody Role role){
        if (role.getId()==null){
            roleService.add(role);
        }else {
            roleService.update(role);
        }

        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        roleService.delete(id);
        return ResponseEntity.ok().build();
    }

    /**
     * 按照条件分页查询角色列表
     * @param roleQuery
     * @return
     */
    @GetMapping("/findByQuery")
    public ResponseEntity<PageList<Role>> findQuery(RoleQuery roleQuery) {
        PageList<Role> roleQuerys = roleService.findByQuery(roleQuery);
        if (roleQuerys==null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(roleQuerys);
    }

    /**
     * 根据员工id查询角色
     * @return
     */
    @GetMapping("/getRoleBiEmployeeId/{id}")
    public ResponseEntity<List<Role> > getRoleBiEmployeeId(@PathVariable Long id){
        List<Role> roles = roleService.loadRoleByEmpId(id);
        if (CollectionUtils.isEmpty(roles)) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(roles);
    }

}
