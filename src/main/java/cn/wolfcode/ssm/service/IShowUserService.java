package cn.wolfcode.ssm.service;

import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.query.PageResult;
import cn.wolfcode.ssm.query.QueryObject;
import org.springframework.stereotype.Service;



public interface IShowUserService {



    public User queryUser();

    PageResult<User> queryPage(QueryObject qo);
}
