package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_25304 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());
    int N  = Integer.parseInt(br.readLine());
    int sum = 0;
    while(N-->0) {
      String[] strArr = br.readLine().split(" ");
      int price = Integer.parseInt(strArr[0]);
      int cnt = Integer.parseInt(strArr[1]);
      sum += price*cnt;
    }
    System.out.println(X == sum ? "Yes" : "No" );
  }
}

// 총금액
// 구매개수 (반복문)
// 가격 개수

// 가격 x 개수 모두 더한것 -> 총금액과 일치 확인

// 일치하면 yes , 안하면 no 출력
