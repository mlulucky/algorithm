package boj.bronze;

import java.util.Scanner;

public class BOJ_1978 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    if (N <= 100) {
      for (int i = 0; i < N; i++) {
        int s = sc.nextInt();
        boolean b = isPrime(s);
        if (b) count++;
      }
      System.out.println(count);
    }
  }

  public static boolean isPrime(int num) {
    if (num == 1) return false;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}

// 소수 카운트하기
// 1과 나 자신만을 인수로 갖는 수
