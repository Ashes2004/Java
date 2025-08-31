package com.dsaPractice;

import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // size of array
        int k = sc.nextInt();  // divisor

        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr.add(element);
        }


        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += arr.get(i);

            // handle negative numbers safely
            int remainder = ((sum % k) + k) % k;

            if (prefixSum.containsKey(remainder)) {
                count += prefixSum.get(remainder);
            }

            prefixSum.put(remainder, prefixSum.getOrDefault(remainder, 0) + 1);
        }

        System.out.println("Number of subarrays divisible by " + k + " = " + count);
    }
}
