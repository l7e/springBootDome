package com.like.service;

import com.like.mapper.UserMapper;
import com.like.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;

    public User findById(Long id)
    {
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void  insertUser(User user)
    {
        userMapper.insert(user);
    }
}
