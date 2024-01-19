package boj.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean condition = 1 <= N && N <= 100;
        if(condition) {
            String[] arr = new String[N];
            Arrays.fill(arr, " ");
            for(int i = N-1; i>=0; i--) {
                arr[i] = "*";
                System.out.println(String.join("", arr));
            }
        }
    }
}
