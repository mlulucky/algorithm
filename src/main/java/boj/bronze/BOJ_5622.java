package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      sum+=telTime(c);
    }
    System.out.println(sum);
  }

  private static int telTime(char c) {
    String[] strArr = {"ABC","DEF","GHI", "JKL","MNO","PQRS","TUV","WXYZ"};
    for(int i=0; i<strArr.length; i++) {
      if(strArr[i].indexOf(c) != -1) { // 있으면 (없지 않으면)
        return i + 3; // 인덱스 0 ("ABC") + 3 => 3 // "ABC"(2번)의 전화거는 시간
      }
    }
    return -1; // 배열에 없는 문자 입력 // '1' '' '가' ...
  }

}

// 시작 1번 : 2초 소요
// 2(ABC) - 3초
// 3(DEF) - 4 초
// 4(GHI) - 5 초
// 5(JKL) - 6 초
// 6(MNO) - 7초
// 7(PQRS) - 8초
// 8(TUV) - 9 초
// 9(WXYZ) - 10 초
// 0 - 11 초

