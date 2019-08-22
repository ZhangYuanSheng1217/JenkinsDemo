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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
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
    
    @Value("${application.simple-date-format}")
    private String dateFormat;
    
    private SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    
    @GetMapping(value = {"hello", "home"})
    public String hello(HttpServletRequest request) {
        return "This is [" + request.getRequestURI() + "]: Hello World!";
    }
    
    @RequestMapping("other")
    public String other(@RequestHeader String path) {
        return "[" + path + "]当前时间: " + sdf.format(new Date());
    }
}
