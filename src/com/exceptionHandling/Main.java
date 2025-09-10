package com.exceptionHandling;



public class Main {
    public static void main(String[] args)
    {
       try{
           Checked.checkedExceptions(15);
       } catch (InvalidAgeException e) {
           System.out.println(e.getMessage());

       }
    }
}
