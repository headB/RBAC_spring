package cn.wolfcode.ssm.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginIndex(){

        return "/WEB-INF/login.html";
    }

}