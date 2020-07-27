package com.myuuutime.server;


import com.myuuutime.entity.sPhoto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class GetFaceServer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private com.myuuutime.mapper.getFacemapper getFacemapper;

    public void addFace(String photo_org, String photo_new) {
        sPhoto photo = new sPhoto();
        photo.setPhoto_org(photo_org);
        photo.setPhoto_new(photo_new);
        photo.setInsert_ts(stringToDate());
        int i = getFacemapper.addFace(photo);
        logger.debug("success add addFace");
    }

    public String stringToDate() {
        String sysData = null;
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            sysData = df.format(new Date());

        } catch (Exception e) {
            e.getStackTrace();
        }
        return sysData;
    }

}
