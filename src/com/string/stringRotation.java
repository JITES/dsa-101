package com.string;

public class stringRotation {

    public static void main(String[] args) {
        System.out.println(checkRotation("jitesh", "tesjhi"));
    }

    public static boolean checkRotation(String name, String rotated) {
        String temp = name + name;
       return name.length() == rotated.length() && temp.indexOf(rotated) != -1;
    }
}
