package com.myuuutime;

import com.myuuutime.server.mailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private mailService MailService;

    @Test
    public void testSimpleMail() throws Exception {
        MailService.sendSimpleMail("sf2033@163.com","test simple mail"," hello this is simple mail");
        System.out.println("发送成功");
    }
}