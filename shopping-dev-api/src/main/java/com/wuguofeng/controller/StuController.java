package com.wuguofeng.controller;

import com.wuguofeng.pojo.Stu;
import com.wuguofeng.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;

@RestController
public class StuController {

    @Autowired
    private StuService stuService;

    @PostMapping("/saveStu")
    public Stu saveStu(Stu stu){
        Stu stu1 = new Stu();
//        stu.setAge();
        return stuService.saveStu(stu1);
    }

}
