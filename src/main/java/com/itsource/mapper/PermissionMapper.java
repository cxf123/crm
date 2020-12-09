package com.itsource.mapper;

import com.aigou.crm.pojo.Role;
import com.itsource.domain.Permission;

import java.util.List;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.mapper
 * @ClassName:      PermissionMapper
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
public interface PermissionMapper extends BaseMapper<Permission>{
    /**
     * 根据角色查询权限
     * @param role
     * @return
     */
    List<Permission> loadPermissionByRole(Role role);

    /**
     * 批量保存权限，加载权限资源
     * @param permissionList
     */
    void loadPermissionResource(List<Permission> permissionList);

    /**
     *根据员工id查询权限
     * @param id
     * @return
     */
    List<Permission> findPermissionByLoginUserId(Long id);
}