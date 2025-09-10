package com.exceptionHandling;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg)
    {
        super(msg);
    }
}

public class Checked {
    public  static void checkedExceptions(int age) throws InvalidAgeException
    {


        if(age < 18)
        {
            throw new InvalidAgeException("age must be greater than or equal to 18.");
        }

    }
}
