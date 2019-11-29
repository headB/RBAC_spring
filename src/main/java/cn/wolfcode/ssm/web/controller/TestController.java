package cn.wolfcode.ssm.web.controller;


import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.service.IShowUserService;
import cn.wolfcode.ssm.service.impl.ShowUserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    @Autowired
    private ShowUserServiceImp showUserServiceImp;

    @RequestMapping("/index")
    public String index(String username,Model model,Integer age,String password){

        model.addAttribute("username",username);
        model.addAttribute("age",age);

        //查询一下查询数据库数据,然后展示到前端的页面来显示!.

        User u1 = showUserServiceImp.queryUser();
        System.out.println(u1);
        model.addAttribute("userInfo",u1);

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
