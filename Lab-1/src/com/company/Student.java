package com.company;

public class Student {
    public String name;
    public int age;
    public float mark;

//    constructor
    public Student(String n, int a, float m){
        name = n;
        age = a;
        mark = m;
    }

//    afisam informatia despre student
    public void ShowStudentInfo(){
        System.out.println("Student: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student average mark: " + mark + "\n");
    }

//    default constructor
    public Student(){}
}
