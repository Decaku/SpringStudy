package com.decaku.mapper;

import com.decaku.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {
       return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
