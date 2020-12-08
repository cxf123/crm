package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Customer
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {
    private Long id;

    private String name;

    private Integer age;

    private Integer gender;

    private String tel;

    private String email;

    private String qq;

    private String wechat;

    private Date inputtime;

    private Integer state;

    private Long customersourceId;

    private Long jobId;

    private Long salarylevelId;

    private Long sellerId;

    private Long inputuserId;

    private static final long serialVersionUID = 1L;
}