package com.string;

import java.util.HashMap;
import java.util.Set;

public class validAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("google", "elgoog"));
    }

    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i =0; i < a.length(); i++) {
            if(map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            }
            else
                map.put(a.charAt(i), 1);
        }

        for(int i = 0; i < b.length(); i++) {
            if(map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            }
        }

        Set<Character> keys = map.keySet();

        for(Character key: keys) {
            if(map.get(key) != 0)
                return false;
        }
        return true;
    }
}
