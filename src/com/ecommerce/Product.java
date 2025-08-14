package com.ecommerce;

public class Product {
    String name;
    Double price;
    public Product(String name , Double price)
    {
        this.name = name;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
    }

}
