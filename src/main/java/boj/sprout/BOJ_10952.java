package boj.sprout;

import java.util.Scanner;

public class BOJ_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == 0 && B == 0) break;
            if ((0 < A && A < 10) && (0 < B && B < 10)) {
                System.out.println(A + B);
            }
        }
    }
}
