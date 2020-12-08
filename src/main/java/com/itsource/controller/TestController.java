package com.itsource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: crm
 * @Package: com.itsource.controller
 * @ClassName: TestController
 * @Author: cxf
 * @Description:
 * @Date: 2020/11/26 21:43
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hh")
    public String test() {
        return "xxx";
    }
    @RequestMapping("/hh")
    public String test1() {
        return "xxx";
    }
}
