package com.CollectionFrameWork;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {

         /*
         ============================================================
         📝 WHY DO WE NEED MAP IN JAVA?
         ------------------------------------------------------------
         - Many times, we need to store data in a way that links a
           "key" to a "value". Example:
             • StudentID → StudentName
             • EmployeeID → Salary
             • CountryCode → CountryName

         - For this, Java provides the Map interface.
         - A Map stores elements in key-value pairs:
             key -> value

         - Key points about Map:
           ✅ Keys are unique (cannot be duplicated)
           ✅ Each key maps to exactly one value
           ✅ Values can be duplicated
           ✅ Keys can be used to quickly search for values

         - Example in real life:
           Phone Directory:
             "Rahul" -> 9876543210
             "Sneha" -> 9123456780
             "Amit"  -> 9000011122

           Here, "name" is the key, "phone number" is the value.
         ============================================================


         ============================================================
         📝 WHAT DOES HASHMAP DO?
         ------------------------------------------------------------
         - HashMap is one of the most commonly used classes
           that implements the Map interface.

         - It stores data in the form of (key, value) pairs.

         - Internally it uses a technique called "Hashing":
           • Each key's hashCode() is used to decide where
             to store the entry in memory (called a bucket).
           • This makes searching, inserting, and deleting
             operations very fast — O(1) on average.

         - Important properties of HashMap:
           ✅ Allows one null key and multiple null values
           ✅ Order is NOT guaranteed (unlike LinkedHashMap which keeps insertion order)
           ✅ Keys must be unique, values can be duplicate
           ✅ Very efficient for search operations

         - Example usage:
             HashMap<Integer, String> map = new HashMap<>();
             map.put(1, "One");
             map.put(2, "Two");
             map.put(3, "Three");
             // Here 1,2,3 are keys → "One","Two","Three" are values.
         ============================================================
        */

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(2, "Duplicate"); // overwrite value for key=2
        System.out.println("After adding: " + map);

        // Size
        System.out.println("Size: " + map.size());

        // isEmpty & contains
        System.out.println("Is Empty? " + map.isEmpty());
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Three'? " + map.containsValue("Three"));

        // Get & replace
        System.out.println("Value at key 1: " + map.get(1));
        map.replace(1, "ONE");
        System.out.println("After replace: " + map);

        // Remove
        map.remove(3); // remove by key
        map.remove(2, "Duplicate"); // conditional remove (only if key=2 and value=Duplicate)
        System.out.println("After removals: " + map);

        // Iterate using keySet
        System.out.print("Iterate using keySet: ");
        for (Integer key : map.keySet()) {
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();

        // Iterate using entrySet + for-each
        System.out.print("Iterate using entrySet: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
        System.out.println();

        // Iterate using Iterator
        System.out.print("Iterator on entrySet: ");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> e = it.next();
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        }
        System.out.println();

        // Java 8 forEach
        System.out.print("Java 8 forEach: ");
        map.forEach((k, v) -> System.out.print(k + "=" + v + " "));
        System.out.println();

        // Clear all
        map.clear();
        System.out.println("After clear: " + map);
    }
}

