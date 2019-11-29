package cn.wolfcode.ssm.service.impl;

import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.mapper.UserMapper;
import cn.wolfcode.ssm.service.IShowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowUserServiceImp implements IShowUserService {

    @Autowired
    UserMapper usermapper;

    @Override
    public User queryUser() {



    }
}
