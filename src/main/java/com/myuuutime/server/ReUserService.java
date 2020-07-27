package com.myuuutime.server;

import com.myuuutime.entity.User;

import com.myuuutime.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by  Sazz
 **/

@Service
public class ReUserService {
    @Autowired
    private UsersMapper usersMapper;

    public User sel(int id) {
        System.out.println(id);
        return usersMapper.findOne();
    }



    public List<User> getAll() {
        System.out.println("-----------");
        List<User> all = usersMapper.findAll();
        return all;
    }


    public User getone() {
        return usersMapper.findOne();

    }

    public User usersgin() {
        usersMapper.findOne();
        return usersMapper.UserSgin();
    }
}
