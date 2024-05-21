package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11050 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    // 경우의 수 - 배열 초기화
    int[][] d = new int[N+1][N+1];
    for(int i=0; i<=N; i++) {
      d[i][1] = i;
      d[i][0] = 1;
      d[i][i] = 1;
    }

    // 점화식 - 경우의 수 구하기
    for(int i=3; i<=N; i++) {
      for(int j=2; j<=i; j++) { // j(K) 는 i(N) 보다 작아야함
        d[i][j] = d[i-1][j] + d[i-1][j-1];
      }
    }

    int result = d[N][K];
    System.out.println(result); // nCk

  }
}

//🤔 이항 계수
// N, K
// N 개 원소 중 K 개를 뽑는 조합의 개수 : nCk (n 컴비네이션 k) - 경우의 수(조합)

// 경우의 수 5C3 == arr[5][3] (2차원 배열)
// 점화식: 특수식 -> 일반식

// 경우의 수(조합) 배열 만들기
// 1. 배열 초기화
// arr[i][1] = i;
// arr[i][0] = 1;
// arr[i][i] = 1;

// 2. 그외 5C6 같이 n 개보다 k 뽑는개수가 많은 경우의수는 0 (불가)

// 그외 나머지 배열의 요소는 점화식으로 구한다.!

// 경우의 수 점화식 만들기
// 5C3 == arr[5][3]
// arr[5][3]
// 우선 총 5개에서 3개를 구하는 경우의 수
// 마지막 5를 제외한 4개에서 3개를 구하는 경우의 수 : 4C3 == arr[4][3]
// 5를 포함하여 3개를 구하는 경우의 수 (5 제외 4개에서 2개를 구하는 경우의 수) : 4C2 == arr[4][2]

// 따라서
// arr[5][3] == arr[4][3] + arr[4][2]
// 5개에서 3개를 구하는 경우의 수는 4개에서 3개 구하는 경우의 수 + 4개에서 2개 구하는 경우의 수 합과 같다.