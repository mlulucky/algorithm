package boj.bronze;

import java.util.Scanner;

public class BOJ_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A+B;
            if (A > 0 && A < 10 && B > 0 && B < 10) {
                System.out.println("Case #" + (i+1) + ": " + sum);
            }
        }
    }
}
