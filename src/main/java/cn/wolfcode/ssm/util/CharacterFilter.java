package cn.wolfcode.ssm.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


//唉.都是用不上的!
//@WebFilter(filterName = "charsetFilter",urlPatterns = "/*.do")
public class CharacterFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("用不用得上我呀!");
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request,response);

    }
}
