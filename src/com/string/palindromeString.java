package com.string;

public class palindromeString {
    public static void main(String[] args) {

    }

    public static int isPalindrome(String S) {
            for(int i = 0, j = S.length() - 1; i < S.length()/2; i++, j--) {
                if(S.charAt(i) != S.charAt(j))
                    return 0;
            }
            return 1;
        }
}
