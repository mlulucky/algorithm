package boj.bronze;

import java.util.Scanner;

public class BOJ_4153 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a == 0 && b == 0 && c == 0) break;
      System.out.println(c*c == a*a + b*b ? "right" : "wrong");
    }
  }
}

// 각 입력에 대해 직각 삼각형인지 확인
// 맞다면 right, 아니면 wrong 출력

// 마지막줄에는 0 0 0 입력