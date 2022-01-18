package com.array;

public class productOfArrayExceptSelf {
    // Prefix sum
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(product(array));
    }

    public static int[] product(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        output[0] = 1;
        // Find the left product
        for (int i = 1; i < n; i++) {
            output[i] = arr[i - 1] * output[i - 1];
        }

        int right = 1;

        for(int i = n - 1; i >= 0 ; i--) {
            output[i] = output[i] * right;
            right = right * arr[i];
        }
        return  output;
    }
}
