package cn.wolfcode.ssm.service.impl;

import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.mapper.UserMapper;
import cn.wolfcode.ssm.service.IShowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowUserServiceImp implements IShowUserService {

    @Autowired
    private UserMapper usermapper;

    @Override
    public User queryUser() {

        User u1 = usermapper.selectByPrimaryKey(1);
        System.out.println(u1);
        return u1;

    }
}