package com.basicOpps;

public class Student extends Department{
    String name;
    String gender;
    int age;

    public Student(String name , String gender , int age , String deptName , String deptId , String clgName)
    {
        super(deptName , deptId , clgName);
        this.name = name;
        this.age = age;
        this.gender = gender;

    }


    public void printData(){
        super.printData();
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("com.basicOpps.Department: " + super.deptName);
        System.out.println("com.basicOpps.College: " + super.clgName);
        System.out.println("Gender: " + this.gender);
    }
}


