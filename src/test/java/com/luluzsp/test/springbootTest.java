package com.luluzsp.test;


import com.luluzsp.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class springbootTest {
    @Autowired
    Person person;

    @Test
    public void contextTest() {
        System.out.println(person);
    }
}
