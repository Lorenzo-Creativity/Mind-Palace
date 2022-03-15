package com.lorenzo.mind_palace.controller;

import com.lorenzo.mind_palace.entity.Demo;
import com.lorenzo.mind_palace.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lorenzo
 * @date 2022/03/13 21:04
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    // @Value("${test.hello}")
    // private String testHello;
    // @RequestMapping("/hello")
    // @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    // @GetMapping("/hello")
    // public String hello() {
    //    return "hello, world" + testHello;
    // }

    @Resource
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list() {
        return demoService.list();
    }
}
