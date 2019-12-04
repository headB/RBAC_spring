package cn.wolfcode.ssm.service;

import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.query.QueryObject;
import com.github.pagehelper.PageInfo;


public interface IShowUserService {



    public User queryUser();

    PageInfo<User> queryPage(QueryObject qo);
}
