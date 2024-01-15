package boj.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        if(A.abs().toString().length() <= 1000 && B.abs().toString().length() <= 1000) {
            System.out.println(A.add(B));
            System.out.println(A.subtract(B));
            System.out.println(A.multiply(B));
        }
    }
}
