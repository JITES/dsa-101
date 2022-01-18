package com.prefixSum;

public class productOfArrayExceptSelf {
    // Pattern - Prefix sum
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(product(array));
    }

    // T O(n) O(1)
    public static int[] product(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            // find the left product
            output[i] = arr[i - 1] * output[i - 1];
        }
        // caveat
        int right = 1;
        
        for(int i = n - 1; i >= 0 ; i--) {
            // product of left and right
            output[i] = output[i] * right;
            // calculate right product from the input array
            right = right * arr[i];
        }
        return  output;
    }
    // T O(n) O(n)
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        //set end cases for prefix and suffix
        prefix[0] = nums[0];
        suffix[nums.length - 1] = nums[nums.length - 1];

        //make an prefix arr, multiplying left to right
        for(int i=1; i<nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i];
        }
        //make an suffix arr, multiplying right to left
        for(int i=nums.length - 2; i>=0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }

        //set answer for end cases
        answer[0] = suffix[1];
        answer[nums.length - 1] = prefix[nums.length - 2];

        //for each index, multiply the prefix of i-1 by the suffix of i+1
        //  (thus omitting nums[i] from the multiplication)
        for(int i=1; i<nums.length - 1; i++) {
            answer[i] = prefix[i - 1] * suffix[i + 1];
        }

        return answer;
    }
}
