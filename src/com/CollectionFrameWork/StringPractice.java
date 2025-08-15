package com.CollectionFrameWork;

public class StringPractice {

    public  static  void main(String[] args)
    {
        String str = "hello";

//        str.append("ko"); string is immutble , we cant add or update the string once it created
        str += " friends"; //here we can update the string but not original strings , + creates new object string and give new object result

        System.out.println(str);
    }
}
