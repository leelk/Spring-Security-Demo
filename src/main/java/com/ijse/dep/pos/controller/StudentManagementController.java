package com.ijse.dep.pos.controller;

import com.ijse.dep.pos.Entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {


    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"Leel"),
            new Student(2,"Heshan"),
            new Student(3,"Sahan")
    );

    @GetMapping
    public List<Student> getAllStudents()
    {
        return  STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentID}")
    public void deleteStudent(@PathVariable("studentID") Integer studentID){
        System.out.println(studentID);
    }


    @PutMapping(path ="{studentID}")
    public void updateStudent(@PathVariable("studentID")Integer studentid, @RequestBody Student student){
        System.out.println("Updating");
    }
}
