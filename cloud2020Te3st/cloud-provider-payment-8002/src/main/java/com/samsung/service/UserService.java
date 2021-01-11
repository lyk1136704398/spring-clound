package com.samsung.service;

import com.samsung.entities.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public int create(User user);
    public User getUserById(@Param("id") Long id);
}
