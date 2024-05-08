package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    while (T-- > 0) {
      String str = br.readLine();
      String printStr = str.charAt(0) + "" + str.charAt(str.length() - 1);
      System.out.println(printStr);
    }
  }
}


// 3 - 테스트케이스 개수
// 문자열의 처음과 끝을 출력
// 0 - 한글자인 경우는 한글자를 두번 출력
// 두글자인경우는 문자그대로 출력
// ...

//3
//ACDKJFOWIEGHE
//O
//AB

