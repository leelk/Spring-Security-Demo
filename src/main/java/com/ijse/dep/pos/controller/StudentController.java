package com.ijse.dep.pos.controller;


import com.ijse.dep.pos.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"Leel"),
            new Student(2,"Heshan"),
            new Student(3,"Sahan")
    );


    @GetMapping(path = "{studentID}")
    public Student getStudent(@PathVariable("studentID") Integer studentId){
            return STUDENTS.stream()
                    .filter(student -> studentId.equals(student.getStudentID()))
                    .findFirst()
                    .orElseThrow(()-> new IllegalStateException("student "+ studentId +"not exist"));
    }
}
