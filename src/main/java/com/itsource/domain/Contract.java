package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Contract
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contract implements Serializable {
    private Long id;

    private Date sn;

    private Long customerId;

    private Date signtime;

    private Long sellerId;

    private Long sum;

    private String intro;

    private static final long serialVersionUID = 1L;
}