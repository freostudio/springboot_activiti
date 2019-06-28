package com.zqsw.repository;
import com.zqsw.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
/*****
 *
 * PersonRepository 
 * @author ：Liye /ZQSW
 * @date ：2019/6/17 9:11
 *  接口功能描述 :
 *
 *****/
public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findByName(String name);
}
