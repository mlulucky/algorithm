package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2747 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n+1];
    arr[1] = 1;

    for (int i = 2; i <= n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    System.out.println(Arrays.toString(arr));
    System.out.println(arr[n]);
  }
}

// 피보나치 수 : 0,1 로 시작
// 0,1 번째 수는 고정
// 2번째 부터 arr[n] = arr[n-1] + arr[n-2]

// n>=2 && n<= 45

// 1. 45 길이 배열 만들기
// 2. 2번째 idx 부터 배열 길이(45)까지 요소를 계산해서 대입
// arr[n] = arr[n-1] + arr[n-2]

// 입력: n
// 출력: 피보나치수

