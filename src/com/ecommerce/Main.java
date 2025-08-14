package com.ecommerce;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Customer Email:");
        String email = sc.nextLine();

        Customer customer = new Customer(name, email);

        boolean running = true;
        while (running) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add Product");
            System.out.println("2. List All Products");
            System.out.println("3. Add Product to Cart");
            System.out.println("4. Show Cart");
            System.out.println("5. Remove Product from Cart");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> listProducts();
                case 3 -> addProductToCart(customer);
                case 4 -> customer.showCartDetails();
                case 5 -> removeProductFromCart(customer);
                case 6 -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addProduct() {
        System.out.println("Select Product Type:");
        System.out.println("1. Grocery");
        System.out.println("2. Clothing");
        System.out.println("3. Electronics");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        switch (type) {
            case 1 -> {
                System.out.print("Enter Expiry Date (dd/MM/yyyy): ");
                String expiry = sc.nextLine();
                productList.add(new Grocery(name, price, expiry));
            }
            case 2 -> {
                System.out.print("Enter Size (int): ");
                int size = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Material: ");
                String material = sc.nextLine();
                productList.add(new Clothing(name, price, size, material));
            }
            case 3 -> {
                System.out.print("Enter Warranty Years: ");
                int years = sc.nextInt();
                sc.nextLine();
                productList.add(new Electronics(name, price, years));
            }
            default -> System.out.println("Invalid product type.");
        }
        System.out.println("✅ Product added successfully!");
    }

    private static void listProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        System.out.println("\n--- Product List ---");
        for (int i = 0; i < productList.size(); i++) {
            System.out.print((i + 1) + ". ");
            productList.get(i).display();
        }
    }

    private static void addProductToCart(Customer customer) {
        listProducts();
        if (productList.isEmpty()) return;

        System.out.print("Enter product number to add: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 1 && index <= productList.size()) {
            customer.addToCart(productList.get(index - 1));
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private static void removeProductFromCart(Customer customer) {
        customer.showCartDetails();
        if (customer.getCart().isEmpty()) return;

        System.out.print("Enter product number to remove: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 1 && index <= customer.getCart().size()) {
            customer.removeFromCart(customer.getCart().get(index - 1));
        } else {
            System.out.println("Invalid product number.");
        }
    }
}
