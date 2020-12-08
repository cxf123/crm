package com.itsource.controller;

import com.itsource.domain.Permission;
import com.itsource.query.PermissionQuery;
import com.itsource.service.PermissionService;
import com.itsource.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.itsource.controller
 * @ClassName: PermissionController
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/7 21:05
 * @Version: 1.0
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    /**
     * 增加或者更新
     * @param permission
     * @return
     */
    @RequestMapping("/saveOrUpdate")
    public ResponseEntity<Void> save(@RequestBody Permission permission) {
        if (permission.getId() == null) {
            permissionService.add(permission);
        }else {
            permissionService.update(permission);
        }

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        permissionService.delete(id);
        return ResponseEntity.ok().build();
    }

    /**
     * 根据id查询权限
     * @param id
     * @return
     */
    @GetMapping("/list/{id}")
    public ResponseEntity<Permission> list(@PathVariable Long id){
        Permission permission = permissionService.get(id);
        if (permission == null) {
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(permission);
        }
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Permission>>  getAll() {
        List<Permission> all = permissionService.getAll();
        if (CollectionUtils.isEmpty(all)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(all);

    }
    @GetMapping("/findByPage")
    public ResponseEntity<PageList<Permission>> findByPage(PermissionQuery permissionQuery){
        PageList<Permission> permission = permissionService.findByQuery(permissionQuery);
        if (permission == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(permission);
    }
}
