package com.ecommerce;

public class Grocery extends Product{
    String expireDate;
    public Grocery(String name, Double price ,  String expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    public void printProductDetails()
    {
        System.out.println("Product name: " + super.name);
        System.out.println("Product Price: " + super.price);
        System.out.println("Expire Date: " + this.expireDate);
    }
}
