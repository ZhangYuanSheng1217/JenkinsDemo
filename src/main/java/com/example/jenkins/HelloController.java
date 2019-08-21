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
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 无
 *
 * @author ZYS
 * @version 1.0
 */
@RestController
public class HelloController {
    
    @GetMapping("hello")
    public String hello() {
        return "This is [hello]: Hello World!";
    }
}
