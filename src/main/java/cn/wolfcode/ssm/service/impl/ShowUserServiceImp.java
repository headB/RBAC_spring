package cn.wolfcode.ssm.service.impl;

import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.mapper.UserMapper;
import cn.wolfcode.ssm.query.PageResult;
import cn.wolfcode.ssm.query.QueryObject;
import cn.wolfcode.ssm.service.IShowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowUserServiceImp implements IShowUserService {

    @Autowired
    private UserMapper usermapper;

    @Override
    public User queryUser() {

        User u1 = usermapper.selectByPrimaryKey(1);
//        System.out.println(u1);

        //下面尝试一下调用查分页的功能。！mybatis快忘记了。
        return u1;

    }

    @Override
    public PageResult<User> queryPage(QueryObject qo) {

        List<User> users = usermapper.queryPage(qo);

        return new PageResult<>(qo.getCurrentPage(),qo.getPageSize(),users,1);

    }


}
