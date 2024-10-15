package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int cnt = 0;
    int num = 666;

    while(true) {
      if(String.valueOf(num).contains("666")) {
        cnt++;
      }
      if(cnt == N) {
        System.out.println(num);
        break; // 반복문 중단
      }
      num++;
    }
  }
}

// n 번째 수를 구하는 규칙을 찾으려고 했었는데,
// 알고보니 브루트포스 풀이였다.. 단순히 모든 경우의 수 구하기
