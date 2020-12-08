package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Customerresourcepool
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerresourcepool implements Serializable {
    private Long id;

    private Integer gender;

    private String tel;

    private Long sellerId;

    private Long customersourceId;

    private Integer stateId;

    private String name;

    private Date inputtime;

    private static final long serialVersionUID = 1L;
}