package boj.bronze;

import java.util.Scanner;

public class BOJ_1259 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    StringBuilder resSb = new StringBuilder();

    while(true) {
      String N = sc.next();
      if(N.equals("0")) break;
      String[] nArr = N.split("");
      sb.setLength(0); // sb 문자열 초기화, 객체의 길이를 0으로 설정 -> 내용이 비워진다. (값이 누적되서)
      for(int i = nArr.length-1; i>=0; i--) {
        sb.append(nArr[i]);
      }
      resSb.append(sb.toString().equals(N) ? "yes" : "no");
      resSb.append("\n");
    }
    System.out.println(resSb);
  }
}

// 문자열 뒤집기
//new StringBuilder(sc.next()).reverse().toString();

// 펠린드롬수
// 앞뒤로 읽어도 똑같은 수
// 입력한 수를 뒤집어서 처음과 동일
