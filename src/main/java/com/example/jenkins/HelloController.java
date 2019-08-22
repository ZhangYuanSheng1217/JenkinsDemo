/*
  Copyright (C), 2018-2019, ZhangYuanSheng
  FileName: HelloController
  Author:   ZYS
  Date:     2019/8/22 00:25
  Description: 
  History:
  <author>          <time>          <version>          <desc>
  作者姓名            修改时间           版本号              描述
 */
package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description: 无
 *
 * @author ZYS
 * @version 1.0
 */
@RestController
public class HelloController {
    
    @GetMapping(value = {"hello", "home"})
    public String hello(HttpServletRequest request) {
        return "This is [" + request.getRequestURI() + "]: Hello World!";
    }
    
    @RequestMapping("other")
    public String other() {
        return "当前时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }
}
