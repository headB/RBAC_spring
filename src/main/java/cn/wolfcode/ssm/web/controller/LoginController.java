package cn.wolfcode.ssm.web.controller;


import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.util.JsonResult;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginIndex() {

        return "login/login";
    }

    @RequestMapping("/css/touchMe")
    public String oldReturn(Model model) {

        String msg1 =  JSON.toJSONString(new JsonResult());
        System.out.println(msg1);

        model.addAttribute("username", new User(44, "kumanxuan", "666"));

        return "forward:/WEB-INF/view/index.jsp";


    }

    @RequestMapping("/css/touchMe1")
    public void oldReturn1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {


        User u1 = new User(44,"beetle","lizhixuan123!");

        httpServletRequest.setAttribute("username",u1);

        httpServletRequest.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(httpServletRequest,httpServletResponse);



    }

}
