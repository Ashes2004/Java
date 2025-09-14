package com.dsaPractice.commonPattern;

public class PrefixSum {
    static int[] prefix(int[] arr) {
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) pre[i] = pre[i - 1] + arr[i];
        return pre;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] pre = prefix(arr);
        int l = 1, r = 3; // sum from index 1 to 3
        System.out.println(pre[r] - (l > 0 ? pre[l - 1] : 0)); // 9
    }
}
