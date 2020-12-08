package com.itsource.service;

import com.itsource.domain.Role;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.itsource.service
 * @ClassName: RoleService
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/5 13:03
 * @Version: 1.0
 */
public interface RoleService extends BaseService<Role> {
    /**
     * 根据员工id查询角色
     * @param id
     * @return
     */
    List<Role> loadRoleByEmpId(Long id);
}
