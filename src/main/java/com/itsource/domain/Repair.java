package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Repair
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repair implements Serializable {
    private Integer id;

    private Date sn;

    private String customerId;

    private Date repairtime;

    private Long repairitemId;

    private Long contractId;

    private Long state;

    private static final long serialVersionUID = 1L;
}