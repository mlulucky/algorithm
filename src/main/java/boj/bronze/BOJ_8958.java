package boj.bronze;

import java.util.Scanner;

public class BOJ_8958 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n > 0) {
      String xo = sc.next();
      if (0 < xo.length() && xo.length() < 80) {
        String[] xoArr = xo.split("X");
        int res = 0;
        for (String str : xoArr) {
          if (str.contains("O")) {
            for (int j = 1; j <= str.length(); j++) {
              res += j;
            }
          }
        }
        System.out.println(res);
        n--;
      }
    }
  }
}

// x 로 나누고, 빈요소는 제외하기
// 요소를 -> 요소의 길이만큼. 1++ 값을 더한다.

