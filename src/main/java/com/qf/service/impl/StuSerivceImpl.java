package com.qf.service.impl;

import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuSerivceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    @Override
    @Transactional
    public int insertStu(Student student) {
        return stuMapper.insertStu(student);
    }
}
