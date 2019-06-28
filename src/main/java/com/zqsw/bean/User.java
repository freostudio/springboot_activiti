package com.zqsw.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 将配置文件yml的person每一个属性值映射到组件中
 * 使用@ConfigurationProperties(prefix = "person")进行绑定
 * 只有这个组件中的容器中的组件，才能容器提供ConfigurationProperties的功能
 */
@Component
@ConfigurationProperties(prefix = "person")
public class User {
    /**
     * @Value 单个属性进行注解
     */
    //@Value("${person.last-name}")//properties的属性
    private String lastName;
    //@Value("#(11*2)")//数值表达式
    private Integer age;
   // @Value("true")//Boolean值
    private boolean boos;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
