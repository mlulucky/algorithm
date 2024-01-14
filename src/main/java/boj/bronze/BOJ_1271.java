package boj.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}

// BigInteger : 문자열형태, 문한범위. 사칙연산 안됨
// 덧셈 add(), 뺄셈 substract(), 곱셈 multiply(), 나눗셈 divide(), 나머지 remainder()
