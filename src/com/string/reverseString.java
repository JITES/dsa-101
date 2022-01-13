package com.string;

public class reverseString {
    public static void main(String[] args) {
        String name = "jitesh";
        char[] nameArr = name.toCharArray();

        for(int i =0, j = name.length() - 1; i < j;i++, j--) {
            char temp = nameArr[i];
            nameArr[i] = nameArr[j];
            nameArr[j] = temp;
        }

        System.out.println(nameArr);
    }
}
