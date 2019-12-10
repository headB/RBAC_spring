package cn.wolfcode.ssm.mapper;

import cn.wolfcode.ssm.domain.User;
import cn.wolfcode.ssm.query.QueryObject;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> queryPage(QueryObject qo);

    List<User> queryForList1(QueryObject qo);

    User selectByAccount(String username);
}