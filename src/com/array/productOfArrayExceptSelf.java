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
        for (int i = 1; i < n; i++) {
            // find the left product
            output[i] = arr[i - 1] * output[i - 1];
        }

        int right = 1;

        for(int i = n - 1; i >= 0 ; i--) {
            // product of left and right
            output[i] = output[i] * right;
            // calculate right product from the input array
            right = right * arr[i];
        }
        return  output;
    }
}
