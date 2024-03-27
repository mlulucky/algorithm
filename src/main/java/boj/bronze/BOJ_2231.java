package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); // 분해합
    int M = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 1; i < N; i++) {
      char[] charArr = String.valueOf(i).toCharArray();
      int sum = 0;
      for (char c : charArr) {
        int num = Character.getNumericValue(c);
        sum += num;
      }
      M = i + sum;
      if (M == N) { // 일때, i 는 198, 207
        if (i < min) {
          min = i;
          break;
        }
      }
    }
    if (min == Integer.MAX_VALUE) {
      System.out.println(0);
    } else {
      System.out.println(min);
    }
  }
}


// BufferedReader br -> br.read() // 256 -> 2 출력 (2 유니코드값 50)
// 개행문자는 줄바꿈

// 🐥 어려웠던 문제..

// 분해합의 생성자 구하기
// 분해합 256
// 생성자 1~255 까지의 숫자에 대해 분해합을 계산하여
// 분해합이 256 과 일치하는 숫자 찾기

// 분해합 1 인 경우
// 생성자 1~
// 분해합은 2부터.
// 따라서 분해합 1의 생성자는 없음 -> 0 출력

// 🐥 방법
// 198 + 1 + 9 + 8 = 216
// 198 은 생성자
// 216 은 분해합
// 216 분해합의 최소 생성자는 198

// 10 + 1 + 0
// 100 + 1 + 0 + 0
// 121 + 1 + 2 + 1 == 216 ?

// 198 을 각자리수로 분해하기 -> num /= 10 으로
// 198 / 10 -> 19
// 19 / 10 -> 1

// 🤔 자리수 분해하는 법 몰랐을때의 방법으로도 풀어보기

// 😮 정수 n 를 각 자리수로 분해하는 법 (외우기)
// n % 10
// n /= 10
// -> n 이 0 이 아닐때 까지

// 198 % 10 -> 8 (나눈 나머지)
// 198 /= 10 -> 19 (나눈 몫)

// 19 % 10 -> 9
// 19 /= 10 -> 1

// 1 % 10 -> 1
// 1 /= 10 -> 0

// 효율성을 높이기 위해 생성자가 될수있는 최소값을 계산해 반복문의 시작점으로 설정하기
// 불필요한 반복을 줄이기
