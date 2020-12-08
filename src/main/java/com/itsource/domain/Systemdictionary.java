package com.itsource.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Systemdictionary
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Systemdictionary implements Serializable {
    private Long id;

    private String sn;

    private String name;

    private String intro;

    private Integer state;

    private static final long serialVersionUID = 1L;
}