package com.itsource.service.impl;

import com.itsource.domain.Role;
import com.itsource.mapper.RoleMapper;
import com.itsource.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.itsource.service.impl
 * @ClassName: RoleServiceImpl
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/5 13:04
 * @Version: 1.0
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role>  implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> loadRoleByEmpId(Long id) {
        List<Role> role = roleMapper.getRolesByEmpId(id);
        return role;
    }
}
