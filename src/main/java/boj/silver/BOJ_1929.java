package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    for(int i=M; i<=N; i++) {
      if(isPrime(i)) System.out.println(i);
    }
  }

  public static boolean isPrime(int num) {
    if(num == 1) return false;
    for(int i= 2; i*i < num; i++) {
      if(num % i == 0) return false;
    }
    return true;
  }
}
// 소수 구하기
// M 이상 N 이하 소수를 모두 출력

// 첫째줄에 M, N 이 주어진다.
// 한줄에 하나씩 증가하는 순서대로 소수 출력

// 제곱근 보다 작거나 같은 자연수로 나누어지지 않는 수(2부터 num 제곱근까지 - 계산 횟수 줄이기)