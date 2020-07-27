package com.myuuutime.mapper;

import com.myuuutime.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by  Sazz
 **/
@Mapper
public interface UsersMapper {
    List<User> findAll();

    User findOne();

    User UserSgin();
}
