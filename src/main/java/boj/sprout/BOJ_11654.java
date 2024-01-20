package boj.sprout;

import java.util.Scanner;

public class BOJ_11654 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int code = str.charAt(0);
    System.out.println(code);
  }
}

// 아스키코드
// int -> char 형변환
// char -> int 형변환

// char 타입이 내부적으로 유니코드 문자를 아스키 코드 값으로 표현
// 정수로 취급가능. 자동으로 아스키코드로 변환