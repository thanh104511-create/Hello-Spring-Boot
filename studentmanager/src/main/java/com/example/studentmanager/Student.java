package com.example.studentmanager;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor mặc định (no-args)
    public Student() {
    }

    // Constructor đầy đủ tham số
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter và Setter (Bắt buộc phải có để Spring chuyển đổi sang JSON)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}