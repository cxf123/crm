package com.itsource.service.impl;

import com.itsource.domain.Permission;
import com.itsource.mapper.PermissionMapper;
import com.itsource.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: crm
 * @Package: com.itsource.service.impl
 * @ClassName: PermissionServiceImpl
 * @Author: cxf
 * @Description:
 * @Date: 2020/12/7 21:01
 * @Version: 1.0
 */
@Service
public class PermissionServiceImpl extends  BaseServiceImpl<Permission>  implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;


}
