package cn.wolfcode.ssm.web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {


    @RequestMapping("/index")
    public String index(String username,Model model,Integer age,String password){

        model.addAttribute("username",username);
        model.addAttribute("age",age);

        //查询一下查询数据库数据,然后展示到前端的页面来显示!.




        return "/WEB-INF/view/index.jsp";
    }

    @RequestMapping("index2")
    public String test1(){

        return "5566";

    }

    @RequestMapping("index3")
    public String test3(){


        return "5566";

    }


}
