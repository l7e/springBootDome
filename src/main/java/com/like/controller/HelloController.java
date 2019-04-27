package com.like.controller;

import com.like.pojo.User;
import com.like.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RequestMapping("/user")
@RestController
public class HelloController
{
//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private UserService userService;


    @GetMapping("{id}")
    public User index(@PathVariable("id") Long id)
    {
        return userService.findById(id);
    }
}
