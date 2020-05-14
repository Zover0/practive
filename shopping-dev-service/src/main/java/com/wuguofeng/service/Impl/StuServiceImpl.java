package com.wuguofeng.service.Impl;

import com.wuguofeng.mapper.StuMapper;
import com.wuguofeng.pojo.Stu;
import com.wuguofeng.service.StuService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private Sid sid;

    @Autowired
    public StuMapper stuMapper;

    @Override
    public Stu saveStu(Stu stu) {
//        Example example = new Example();
        String sid1 = sid.nextShort();
        Stu stu1 = new Stu();
        stu1.setId(sid1);

        return null;
    }
}
