package com.samsung.service.impl;

import com.samsung.dao.UserDao;
import com.samsung.entities.User;
import com.samsung.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int create(User user) {
        return userDao.create(user);
    }


    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
