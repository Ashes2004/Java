package com.ecommerce;

import java.sql.SQLOutput;

public class Electronics extends Product{
    int warrantyYears;
    public Electronics(String name, Double price , int warrantyYears) {
        super(name, price);

        this.warrantyYears = warrantyYears;
    }


    public void printProductDetails()
    {
        System.out.println("Product name: " + super.name);
        System.out.println("Product Price: " + super.price);
        System.out.println("Year of Warranty: " + this.warrantyYears);
    }
}
