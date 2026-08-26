package com.example.studentmanager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/student")
    public String greet(@RequestParam String name) {
        return "Xin chào " + name;
    }

    @GetMapping("/searchStudent")
    public String searchStudent(
            @RequestParam String name,
            @RequestParam(defaultValue = "1") int age) {
        return "Tên=" + name + ", tuổi=" + age;
    }

    @GetMapping("/students")
    public Student getStudent() {
        return new Student(1, "Nguyễn Văn A", 20);
    }

    @GetMapping("/studentall")
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "A", 20));
        list.add(new Student(2, "B", 21));
        return list;
    }

    @GetMapping("/getstudent")
    public String getStudents(
            @RequestHeader(value = "Authorization", defaultValue = "Bearer abc123") String authorization) {
        return "Authorization = " + authorization;
    }
}