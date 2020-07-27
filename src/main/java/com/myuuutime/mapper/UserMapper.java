//package com.myuuutime.mapper;
//
//import com.myuuutime.entity.User;
//import org.apache.ibatis.annotations.*;
//import org.springframework.stereotype.Repository;
//
///**
// * mapper的具体表达式
// */
//@Mapper //标记mapper文件位置，否则在Application.class启动类上配置mapper包扫描
//public interface UserMapper {
//
//    /**
//     * 查询用户名是否存在，若存在，不允许注册
//     * 注解@Param(value) 若value与可变参数相同，注解可省略
//     * 注解@Results  列名和字段名相同，注解可省略
//     * @param username
//     * @return
//     */
//    User findUserByName(@Param("username") String username);
//
//    /**
//     * 注册  插入一条user记录
//     * @param user
//     * @return
//     */
//    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
//    void regist(User user);
//
//    /**
//     * 登录
//     * @param user
//     * @return
//     */
//    Long login(User user);
//}
