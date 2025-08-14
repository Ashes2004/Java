package com.CollectionFrameWork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Add elements
        arr.add(1);
        arr.add(2);
        arr.add(2); // duplicate allowed
        arr.add(1, 99); // insert at index 1
        System.out.println("After adding: " + arr);

        // Size
        System.out.println("Size: " + arr.size());

        // isEmpty & contains
        System.out.println("Is Empty? " + arr.isEmpty());
        System.out.println("Contains 2? " + arr.contains(2));

        // Index checks
        System.out.println("First index of 2: " + arr.indexOf(2));
        System.out.println("Last index of 2: " + arr.lastIndexOf(2));

        // Get & set
        System.out.println("Element at index 1: " + arr.get(1));
        arr.set(1, 55);
        System.out.println("After set: " + arr);

        // Remove
        arr.remove(Integer.valueOf(2)); // remove first occurrence of value
        arr.remove(0); // remove by index
        System.out.println("After removals: " + arr);

        // Convert to array
        Integer[] arr1 = arr.toArray(new Integer[0]);
        System.out.println("Array: " + arr1[0] + " " + arr1[1]);

        // Iterate using Iterator
        Iterator<Integer> it = arr.iterator();
        System.out.print("Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Iterate using ListIterator (both directions)
        ListIterator<Integer> lit = arr.listIterator();
        System.out.print("ListIterator forward: ");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();

        // Java 8 forEach
        System.out.print("Java 8 forEach: ");
        arr.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Clear all
        arr.clear();
        System.out.println("After clear: " + arr);
    }
}
