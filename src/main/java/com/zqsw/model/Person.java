package com.zqsw.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/*****
 *
 * Person 
 * @author ：Liye /ZQSW
 * @date ：2019/6/17 9:10
 *  功能描述 :
 *
 *****/
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Date birthDate;

    public Person() {
    }

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}