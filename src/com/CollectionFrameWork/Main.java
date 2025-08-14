//1. What is the Java Collection Framework (JCF)?
//
//The Java Collection Framework is a set of interfaces, classes, and algorithms in the java.util package that provides ready-made data structures and methods to store, retrieve, and manipulate groups of objects efficiently.
//
//Think of it as Java’s toolbox of data structures — instead of writing your own Linked List, Hash Table, or Tree, you use the well-tested, optimized ones from JCF.


package com.CollectionFrameWork;
import  java.util.Arrays;
public class Main {
  public static void main(String[] args)
  {
      int[] arr = {10 , 15 , 2 , 3};

      Arrays.sort(arr);

      for(int i : arr)
      {
          System.out.println(i);
      }

      System.out.println(Arrays.binarySearch(arr , 7));
      int[] copy = Arrays.copyOf(arr, arr.length);
      System.out.println("Copy: " + Arrays.toString(copy));
  }

}
