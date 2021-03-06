package cn.wolfcode.ssm.web.controller;


import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.mapper.UserMapper;
import cn.wolfcode.ssm.query.QueryObject;
import cn.wolfcode.ssm.service.IShowUserService;
import cn.wolfcode.ssm.util.RequirementPerssion;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IShowUserService showUserServiceImp;

    @RequestMapping("/index33")
    @ResponseBody
    public Map<String,String> returnMap(String username){

        //查询mapper
        User user1 = userMapper.selectByAccount(username);
        System.out.println("this is my unfinded user" + user1);

        Map<String,String> map = new HashMap();
        map.put("username","kumanxuan");
        map.put("passowrd","lizhixuan123!");
//        map.put("")

        return map;
    }

    @RequirementPerssion(name="66")
    @RequestMapping("/index")
    public String index(@ModelAttribute("name1")  String username, Model model, Integer age, String password, User user, QueryObject qo){

        model.addAttribute("username",username);
        model.addAttribute("age",age);



        System.out.println(user);




        //查询一下查询数据库数据,然后展示到前端的页面来显示!.

        User u1 = showUserServiceImp.queryUser();
        System.out.println(u1);
        model.addAttribute("userInfo",u1);

        //查询分页结果.
        PageInfo<User> pageResult = showUserServiceImp.queryPage(qo);



        model.addAttribute("pageInfo",pageResult);

        //尝试获取session
        System.out.println(pageResult);

        return "index";
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
