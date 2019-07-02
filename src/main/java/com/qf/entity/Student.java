package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
    private Double score;
    private Date birthday;
    private Integer cid;

    public Student(Integer id, String name, Integer age, Double score, Date birthday, Integer cid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.birthday = birthday;
        this.cid = cid;
    }
}
