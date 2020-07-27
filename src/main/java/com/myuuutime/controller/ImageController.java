package com.myuuutime.controller;

import com.myuuutime.server.WaterMarkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by  Sazz
 **/
@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private WaterMarkUtils waterMarkUtils;

//    @GetMapping("/mark")
//    public String getAll() {
//        String srcImgPath = "C:\\Users\\songfei\\Desktop\\166707_pen_color2.png";
//        String iconPath = "C:\\Users\\songfei\\Desktop\\zg01.png";
//        String targerPath = "C:\\tmp\\image.jpg";
////        String targerPath2 = "C:\\tmp\\image2.jpg";
//
//        String s = waterMarkUtils.markImageByIcon(iconPath, srcImgPath, targerPath, null);
//        System.out.println("===="+s);
//        return s;
//    }
}
