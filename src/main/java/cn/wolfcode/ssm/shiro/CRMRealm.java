package cn.wolfcode.ssm.shiro;

import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.mapper.UserMapper;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//感觉这一步是在给这个bean起别名
@Component("crmRealm")
public class CRMRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //其实这里就是如果返回不为空的话，就是账号密码是对的！。


        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {


        //其实这里就是如果返回不为空的话，就是账号密码是对的！。
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        System.out.println(token.getUsername());

            //尝试去数据库访问数据

            User user = userMapper.selectByAccount(token.getUsername());

           if (user.getUsername() != null){

            return new SimpleAuthenticationInfo(user,user.getPassword(),this.getName());

        }

        return null;
    }
}
