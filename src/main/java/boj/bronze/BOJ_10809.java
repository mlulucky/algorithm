package boj.bronze;

import java.util.Scanner;

public class BOJ_10809 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    if(S.length() <= 100) {
      String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
      for(String str : strArr) {
        System.out.print(S.indexOf(str) + " ");
      }
    }
  }
}

// 단어 S
// 단어 길이 100 이하, 알파벳 소문자
// a ~ z 가 등장하는 위치를 출력
// 알파벳 개수 26개

// print : 한줄 출력
// println : 줄바꿈 출력
