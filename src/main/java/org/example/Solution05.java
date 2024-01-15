package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution05 {
    public static void main(String[] args) {
        String str = "THE RAIN IN KOREA";
//        String str = "IN THE RAIN AND THE SNOW";
        hasDuplicatedWord(str);
    }

    public static boolean hasDuplicatedWord(String str) {
        String[] arr = str.split(" ");
        Set<String> set = new HashSet();
        for(String text : arr) {
            if(!set.add(text)) {
                return true;
            }
        }
        return false;
    }
}
