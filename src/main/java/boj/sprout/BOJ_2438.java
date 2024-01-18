package boj.sprout;

import java.util.Scanner;

public class BOJ_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N>=1 && N<=100) {
            String star = "";
            for(int i=0; i<N; i++) {
                star +="*";
                System.out.println(star);
            }
        }
    }
}
