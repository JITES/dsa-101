package com.string;

import java.util.HashMap;

public class duplicateCharacters {
    public static void main(String[] args) {
        findDuplicateChar("geekForGeeks");
    }

    public static void findDuplicateChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length() ; i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            map.put(str.charAt(i), 1);
        }
    }
}
