package boj.bronze;

import java.util.Scanner;

public class BOJ_10250 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    while (i > 0) {
      int H = sc.nextInt(); // 층수
      int W = sc.nextInt(); // 방개수
      int N = sc.nextInt(); // 몇번째 손님
      int a = N % H; // 층
      int b = N / H + 1; // 호수
      if (a == 0) {
        a = H;
      }
      String roomNum = a + String.format("%02d", b);
      System.out.println(roomNum);
      i--;
    }
  }
}
