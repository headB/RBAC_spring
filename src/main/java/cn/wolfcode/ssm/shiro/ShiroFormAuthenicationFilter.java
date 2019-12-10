package cn.wolfcode.ssm.shiro;

import cn.wolfcode.ssm.util.JsonResult;
import com.alibaba.fastjson.JSON;
import lombok.SneakyThrows;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;


@Component("crmFormAuthenicationFilter")
public class ShiroFormAuthenicationFilter extends FormAuthenticationFilter {


    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) {


        try {



            response.setContentType("application/json;charset=utf-8");
            String msg = JSON.toJSONString(new JsonResult());
            response.getWriter().print(msg);




        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }


    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {


        try {
            response.setContentType("application/json;charset=utf-8");
            String msg = JSON.toJSONString(new JsonResult("登陆失败!",false));
            response.getWriter().print(msg);
            System.out.println(e);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;

    }
}
