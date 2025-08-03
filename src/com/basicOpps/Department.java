package com.basicOpps;

public class Department extends College{
    String deptName;
    String deptId;

    public Department(String deptName , String deptId , String clgName)
    {   super(clgName);
        this.deptName = deptName;
        this.deptId = deptId;
    }
    public void printData()
    {
        System.out.println("data: "  + this.deptId + " " + this.deptName);
    }
}

