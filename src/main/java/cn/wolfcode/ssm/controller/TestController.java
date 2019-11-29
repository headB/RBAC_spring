package cn.wolfcode.ssm.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {


    @RequestMapping("/index")
    public String index(String username,Model model,Integer age,String password){

        model.addAttribute("username",username);
        model.addAttribute("age",age);


        return "/WEB-INF/view/index.jsp";
    }

    @RequestMapping("index2")
    public String test1(){
        System.out.println(777);
        return "5566";

    }

    @RequestMapping("index3")
    public String test3(){


        return "5566";

    }


}
