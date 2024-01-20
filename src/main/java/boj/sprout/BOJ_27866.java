package boj.sprout;

import java.util.Scanner;

public class BOJ_27866 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int i = sc.nextInt();
    if(S.matches("^[a-zA-Z]*$")) {
      if((1<=i && i<=S.length()) && S.length()<=1000) {
        System.out.println(S.charAt(i-1));
      }
    }
  }
}

// 정규표현식
// ^ 는 문자열의 시작
// $ 는 문자열의 끝