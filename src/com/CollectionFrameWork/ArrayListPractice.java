package com.CollectionFrameWork;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args)
    {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);

        for(int i : arr)
        {
            System.out.println(i);
        }

        System.out.println(arr.isEmpty());
        System.out.println(arr.contains(2));
        System.out.println(arr.indexOf(2));
        arr.set(1 , 5);
        System.out.println(arr.get(1));
        Integer arr1[] =  arr.toArray(new Integer[0]);

        System.out.println(arr1[0] + " " + arr1[1]);

    }
}
