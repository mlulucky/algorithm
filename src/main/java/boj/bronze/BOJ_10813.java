package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10813 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // N 만큼 바구니(배열) 생성
    int[] basket = new int[N];

    // 바구니 공번호 초기화
    for (int i = 0; i < N; i++) {
      basket[i] = i + 1;
    }

    // M 만큼 시도
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      // 바구니 인덱스 번호
      int aIdx = Integer.parseInt(st.nextToken()) - 1;
      int bIdx = Integer.parseInt(st.nextToken()) - 1;

      // 공 교환
      int tmp = basket[aIdx];
      basket[aIdx] = basket[bIdx];
      basket[bIdx] = tmp;
    }

    for (int ballNum : basket) {
      sb.append(ballNum).append(" ");
    }
    System.out.println(sb);
  }
}

// StringTokenizer 는 주어진 문자열을 토큰으로 분리하는 역할
// 매번 새로운 입력 문자열 처리를 위해 매번 새로운 StringTokenizer 객체를 생성하고 초기화해야함.