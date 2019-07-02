package com.qf.controller;


import com.qf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qf.service.IStuService;

import java.util.Date;

@RestController
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService studentService;

    @RequestMapping("/insert")
    public String insert(){
        Student student = new Student(null, "小王八", 18888, 1.0, new Date(), 1);
        studentService.insertStu(student);
        return "succ";
    }
}
