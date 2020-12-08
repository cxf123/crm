package com.itsource.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Systemdictionaryitem
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Systemdictionaryitem implements Serializable {
    private Long id;

    private Long parentId;

    private String name;

    private Long requence;

    private String intro;

    private static final long serialVersionUID = 1L;
}