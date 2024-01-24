package boj.sprout;

import java.util.Scanner;

public class BOJ_2475 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    String[] numArr =  num.split(" ");
    int sum = 0;
    for(String n : numArr) {
      int a = Integer.parseInt(n);
      a *= a;
      sum += a;
    }
    int resNum = sum%10;
    System.out.println(resNum);
  }
}

// 총 6자리 수
// 5자리 일반 숫자
// 6자리 -> 5자리 숫자의 각 값을 제곱한 수들의 합을 10으로 나눈 나머지
// 검증 수 출력