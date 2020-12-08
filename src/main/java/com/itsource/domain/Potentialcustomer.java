package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Potentialcustomer
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Potentialcustomer implements Serializable {
    private Long id;

    private Long customer;

    private Integer successrate;

    private String remark;

    private String linkman;

    private String linkmantel;

    private Long inputuserId;

    private Date inputtime;

    private Long customersourceId;

    private Integer status;

    private String sn;

    private static final long serialVersionUID = 1L;
}