package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Customertransfer
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customertransfer implements Serializable {
    private Long id;

    private String name;

    private Long oldsellerId;

    private Long newsellerId;

    private String transreason;

    private Date transtime;

    private Long transuserId;

    private static final long serialVersionUID = 1L;
}