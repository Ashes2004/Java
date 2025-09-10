package com.exceptionHandling;

public class Unchecked {
    public static void UncheckedException() {
        int a = 10 , b = 0;
        try{
            int c = a / b;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
