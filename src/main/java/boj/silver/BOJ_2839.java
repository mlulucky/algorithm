package boj.silver;

import java.util.Scanner;

public class BOJ_2839 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 설탕 kg
    int a = N / 5; // 5kg 봉지 최대 개수
    for (int i = a; i >= 0; i--) {
      int c = 5 * i;
      if ((N - c) % 3 == 0) {
        int d = (N - c) / 3; // 3kg 봉지 개수
        System.out.println(i+d);
        return;
      }
    }
    System.out.println(-1);
  }
}

// 봉지 개수 -> 5kg 봉지 개수 0부터 N/5 까지 반복 -> 남은 설탕 무게 3으로 나누어 나머지 0인지 확인





