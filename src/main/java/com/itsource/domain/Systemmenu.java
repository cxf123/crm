package com.itsource.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      Systemmenu
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Systemmenu implements Serializable {
    private Long id;

    private String sn;

    private String name;

    private String url;

    private String icon;

    private String intro;

    private Long parentId;

    private static final long serialVersionUID = 1L;
}