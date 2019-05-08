package com.tao.provideruser.controller;

import com.tao.provideruser.dao.UserMapper;
import com.tao.provideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author yangtao
 * @version 0.0.1
 * @since 2019/3/23
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") int id) {
        User findOne = userMapper.getOne(id);
        return findOne;
    }
}
