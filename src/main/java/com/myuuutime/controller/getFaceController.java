package com.myuuutime.controller;


import com.myuuutime.server.GetFaceServer;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class getFaceController {

    @Autowired
    private GetFaceServer getFaceServer;
    @PostMapping("/quick")
    @ResponseBody
    public String quick(@RequestParam("first_image") String data, @RequestParam("second_image") String data2) throws IOException, JSONException {
        String face = com.myuuutime.utils.face.getFace(data, data2);
//        String  face="0.932831";
//        String s = Math.random()*10 > 5 ? face : "0.3";

        getFaceServer.addFace(data,data2);
        return face;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/403")
    public String error403() {
        return "error/403";
    }

}
