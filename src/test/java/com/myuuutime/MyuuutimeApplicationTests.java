package com.myuuutime;

import com.myuuutime.entity.User;
import com.myuuutime.server.ReUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyuuutimeApplicationTests {

    @Autowired
    private ReUserService userService;
    @Test
    public void contextLoads() {
//        List<User> all = userService.getAll();
        User all = userService.getone();
        System.out.println(all);
    }

//        @Test
//        public void encoder() {
//    String password = "admin";
//    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
//    String enPassword = encoder.encode(password);
//    System.out.println(enPassword);
//}

}
