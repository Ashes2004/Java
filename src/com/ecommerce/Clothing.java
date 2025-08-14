package com.ecommerce;

import java.sql.SQLOutput;

public class Clothing extends Product{
    int size;
    String material;
    public Clothing(String name, Double price , int size , String material) {
        super(name, price);

        this.size = size;
        this.material = material;
    }

    public void printProductDetails()
    {
        System.out.println("Product name: " + super.name);
        System.out.println("Product Price: " + super.price);
        System.out.println("size: " + this.size);
        System.out.println("Material: " + this.material);
    }


}
