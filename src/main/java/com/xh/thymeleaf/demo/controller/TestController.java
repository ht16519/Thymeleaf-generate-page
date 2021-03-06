package com.xh.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Name TestController
 * @Description
 * @Author wen
 * @Date 2019-04-01
 */
@Controller
@RequestMapping("/security")
public class TestController {

    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登陆失败，用户名或密码错误！");
        return "login";
    }
}
