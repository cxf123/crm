package com.itsource.mapper;

import com.itsource.domain.Role;
import com.itsource.domain.RolePermission;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.mapper
 * @ClassName:      RoleMapper
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
public interface RoleMapper extends BaseMapper<Role>{
    //定义集合装role的id和permission的id;
    void saveRolePermission(List<RolePermission> rolePermission);

    /**
     * 通过角色id删除中间表信息
     * @param roleId
     */
    void removeRolePermission(Serializable roleId);

    /**
     * 根据员工id查角色
     * @param eid
     * @return
     */
    List<Role> getRolesByEmpId(Long eid);
}