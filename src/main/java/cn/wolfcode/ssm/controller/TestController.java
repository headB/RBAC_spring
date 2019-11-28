package cn.wolfcode.ssm.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {


    @RequestMapping("/index")
    public String index(){


        return "/WEB-INF/view/index.jsp";
    }


}
