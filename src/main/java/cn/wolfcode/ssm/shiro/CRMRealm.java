package cn.wolfcode.ssm.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;


//感觉这一步是在给这个bean起别名
@Component("crmRealm")
public class CRMRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //其实这里就是如果返回不为空的话，就是账号密码是对的！。


        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {


        //其实这里就是如果返回不为空的话，就是账号密码是对的！。
        UsernamePasswordToken username = (UsernamePasswordToken)authenticationToken;
        System.out.println(username.getUsername());

        return null;
    }
}
