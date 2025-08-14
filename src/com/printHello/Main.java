package com.printHello;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        messagePrinter mp = new messagePrinter();

        mp.printMessage(name);


    }
}
