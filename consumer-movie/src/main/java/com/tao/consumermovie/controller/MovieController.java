package com.tao.consumermovie.controller;

import com.tao.consumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 *
 * @author yangtao
 * @version 0.0.1
 * @since 2019/3/23
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") int id) {
        return restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }
}
