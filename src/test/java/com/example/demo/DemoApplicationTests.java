package com.example.demo;

import com.example.demo.domain.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }




    @Test
    public void addNumber(){
        StudentTest studentTest = new StudentTest();
        Assert.assertEquals(9,studentTest.add(5,4));
    }


    @Test
    public void checkValue() {

        Student student = new Student();
        student.setId(Long.parseLong("2")).setFirstname("Binod").setLastname("Pant");

        Student student1 = new Student();
        student1.setFirstname("Binod").setLastname("Pant");
        Assert.assertEquals(Long.parseLong("2"),student1.getId().toString());


    }

}
