package boj.bronze;

import java.util.Scanner;

public class BOJ_2292 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (1 <= N && N <= 1000000000) {
      int instance = 1; // 거리 기본
      int i=1;
      while(i<N) {
        i += instance * 6; // 6 의 배수
        instance++;
      }
      System.out.println(instance);
    }
  }
}
