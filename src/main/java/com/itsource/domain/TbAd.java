package com.itsource.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName:    crm 
 * @Package:        com.itsource.domain
 * @ClassName:      TbAd
 * @Author:     cxf
 * @Description:  ${description}  
 * @Date:    2020/11/27 11:55
 * @Version:    1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbAd implements Serializable {
    /**
    * ID
    */
    private Integer id;

    /**
    * 广告名称
    */
    private String name;

    /**
    * 广告位置
    */
    private String position;

    /**
    * 开始时间
    */
    private Date startTime;

    /**
    * 到期时间
    */
    private Date endTime;

    /**
    * 状态
    */
    private String status;

    /**
    * 图片地址
    */
    private String image;

    /**
    * URL
    */
    private String url;

    /**
    * 备注
    */
    private String remarks;

    private static final long serialVersionUID = 1L;
}