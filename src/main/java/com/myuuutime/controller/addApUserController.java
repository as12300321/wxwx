package com.myuuutime.controller;


import com.myuuutime.server.AddApUserServer;
import com.myuuutime.utils.StatusResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;


@RestController
public class addApUserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AddApUserServer addApIserServer ;

    @PostMapping("/add_ap_user")
    @ResponseBody
    public String quick(@RequestParam(value = "name", required = false) String apUser, @RequestParam(value = "phone", required = false) String apIphone,
                        @RequestParam(value = "email", required = false) String apEmail, @RequestParam(value = "word", required = false) String apComm
                        ) throws MessagingException {

        boolean result = addApIserServer.addApUser(apUser, apIphone, apEmail, apComm);
        logger.debug("====> name:"+apUser+"---"+apIphone+"---"+apEmail+"---"+apComm+"---");
        return  result == true ?
                StatusResponse.SUCCESS.getDescription()
                : StatusResponse.FAILED.getDescription();
    }

}
