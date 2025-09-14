package com.dsaPractice.commonPattern;

public class SlidingWindow {
    static int maxSum(int[] arr, int k) {
        int sum = 0, maxSum = 0;
        int i = 0;

        // Calculate initial sum of first 'k' elements
        while (i < k) {
            sum += arr[i];
            i++;
        }
        maxSum = sum;

        // Slide the window through the array
        while (i < arr.length) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
            i++;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSum(arr, 3)); // 9
    }
}

