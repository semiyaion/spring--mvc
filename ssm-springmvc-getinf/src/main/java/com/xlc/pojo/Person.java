package com.xlc.pojo;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2024/12/1 16:00
 * @Created by cxx
 */
@Data
public class Person {
    private String name;
    private Integer age;
    private String gender;
}
