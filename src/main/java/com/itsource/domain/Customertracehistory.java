package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Customertracehistory
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customertracehistory implements Serializable {
    private Long id;

    private Long customer;

    private Long traceuserId;

    private Date tracetime;

    private Long tracetypeId;

    private Integer traceresult;

    private String title;

    private String remark;

    private static final long serialVersionUID = 1L;
}