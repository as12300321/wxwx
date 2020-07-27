package com.myuuutime.server;

import com.myuuutime.entity.apUser;
import com.myuuutime.mapper.apusermapper;
import org.apache.naming.factory.SendMailFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AddApUserServer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private apusermapper aapusermapper;

    private com.myuuutime.utils.SendMailUtil sendMailUtil;

    public boolean addApUser(String apUser, String apEmail, String apiphone, String apComm) throws MessagingException {
        com.myuuutime.entity.apUser napUser = new apUser();
        napUser.setUsername(apUser);
        napUser.setUemail(apEmail);
        napUser.setUiphone(apiphone);
        napUser.setUcomment(apComm);
        napUser.setIfappointment("1");

        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println(dateFormat.format(date));
        napUser.setInsert_ts(dateFormat.format(date));
       // int i = aapusermapper.addApUser(napUser);
        String success_add_ap_user = "success add ap_user";
        logger.debug(success_add_ap_user);
        String send = sendMailUtil.SendMail("sf2033@163.com", "2446334331@qq.com", "提交表单" + dateFormat.format(date), "姓名：" + apUser + " 邮箱：" + apEmail + " 手机：" + apiphone + "  comment：" + apComm);
        return 1>0?true:false;
    }
}
