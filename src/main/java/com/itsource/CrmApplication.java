package com.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ProjectName: crm
 * @Package: com.itsource
 * @ClassName: CrmApplication
 * @Author: cxf
 * @Description:
 * @Date: 2020/11/26 21:42
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan("com.itsource.mapper")
public class CrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }
}
