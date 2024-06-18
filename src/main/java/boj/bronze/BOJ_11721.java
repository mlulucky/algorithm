package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11721 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int cnt = 1;
    for(int i=0; i<str.length(); i+=10) {
      int lastIndex = 10*cnt;
      if(lastIndex > str.length()) {
        System.out.println(str.substring(i));
        return;
      }
      System.out.println(str.substring(i,lastIndex));
      cnt++;
    }
  }
}

// 단어를 길이 10으로 잘라서 출력.
// 한줄에 10글자씩 끊어서 출력

// 1. 문자의 전체길이 확인
// 2. 길이 10 단위로 잘름
// 3. 길이 10 이상인 경우 반복문 실행(10 단위)
// 4. 마지막인덱스(계산된 인덱스)가 문자 전체길이보다 큰 경우 예외처리

// 코드 리팩토링
//for(int i=0; i<str.length(); i+=10) {
//  int lastIndex = Math.min(i+10, str.length());
//  System.out.println(str.substring(i, lastIndex));
//}
