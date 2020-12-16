package com.decaku.service;

import com.decaku.dao.UserDao;
import com.decaku.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    public UserDao userDao;

    //利用set实现动态值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
