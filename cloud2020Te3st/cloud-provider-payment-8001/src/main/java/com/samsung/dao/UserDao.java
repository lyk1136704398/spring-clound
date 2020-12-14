package com.samsung.dao;

import com.samsung.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    public int create(User user);
    public User getUserById(@Param("id") Long id);
}
