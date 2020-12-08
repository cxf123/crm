package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Customerdevplan
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerdevplan implements Serializable {
    private Long id;

    private Date plantime;

    private String plansubject;

    private String plandetails;

    private Long plantypeId;

    private Long potentialcustomerId;

    private Long inputuserId;

    private Date inputtime;

    private static final long serialVersionUID = 1L;
}