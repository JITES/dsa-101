package com.array;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {

    }

    public static void product(int[] arr) {
        int[] output = new int[arr.length];
        int product = 1;
        for (int i = 1; i < arr.length; i++) {
            product *= output[i - 1];
            output[i] = product;
        }

        product = 1;
        for(int i = arr.length - 2; i < arr.length; i--) {
            product *= output[i + 1];
            output[i] = product
        }
    }
}
