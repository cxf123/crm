package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      UndoLog
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UndoLog implements Serializable {
    private Long id;

    private Long branchId;

    private String xid;

    private byte[] rollbackInfo;

    private Integer logStatus;

    private Date logCreated;

    private Date logModified;

    private String ext;

    private static final long serialVersionUID = 1L;
}