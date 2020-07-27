package com.myuuutime.controller;

import com.myuuutime.entity.User;
import com.myuuutime.server.ReUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by  Sazz
 **/
@RestController
@RequestMapping("/users")
public class ReUesrController {

        @Autowired
        private ReUserService userService;

        @GetMapping("/all")
        public List<User> getAll() {
            return userService.getAll();
        }

        @GetMapping("/one")
        public User getone() {
            return userService.getone();

        }
        @GetMapping("/sgin")
        public User usersgin() {
            return userService.usersgin();

        }
        @RequestMapping("getUser/{id}")
        public String getUser(@PathVariable int id) {
            return userService.sel(id).toString();
        }

}
