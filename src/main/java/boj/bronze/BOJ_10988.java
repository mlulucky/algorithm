package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String originStr = br.readLine();
    StringBuilder reverseStr = new StringBuilder(originStr).reverse();
    System.out.println(originStr.equals(reverseStr.toString()) ? 1 : 0);
  }
}

// 펠린드롬 : 앞으로 읽을때, 거꾸로 읽을때 똑같은 단어
// 펠린드롬인지 확인하기
// 펠린드롬이면 : 1, 아니면 : 0 출력

// 문자열뒤집기
// 1. 문자열 -> 문자배열로 만들어서 반복문돌려서 뒤집은 문자열 만들기
// -> StringBuilder 의 reverse 가 더 빠르다..