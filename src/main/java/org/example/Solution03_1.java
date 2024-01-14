package org.example;

public class Solution03_1 {
    private static void solution(int[] arr) {
        int max = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i + 1;
            }
        }
        System.out.println(max + " " + idx);
    }
}
