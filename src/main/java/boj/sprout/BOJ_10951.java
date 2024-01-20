package boj.sprout;

import java.util.Scanner;

public class BOJ_10951 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      if ((0 < A && A < 10) && (0 < B && B < 10)) {
        System.out.println(A+B);
      }
    }
  }
}
