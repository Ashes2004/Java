package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String email;
    List<Product> cart;
    public Customer(String name , String email)
    {
        this.name = name;
        this.email = email;
        this.cart = new ArrayList<>();
    }


    public void  printCustomerDetails()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Email: " + this.email);

    }

    public void showCartDetails()
    {
        double totalPrice = 0;
        for(Product p : cart)
        {
            System.out.println("Product name: " + p.name + " , price : " + p.price);
            totalPrice += p.price;
        }
        System.out.println("Total price : " + totalPrice);

    }

    public List<Product> getCart() {
        return cart;
    }

    public void addToCart(Product p1)
    {
        this.cart.add(p1);

    }

   public void removeFromCart(Product p1)
    {
        this.cart.remove(p1);
    }


}
