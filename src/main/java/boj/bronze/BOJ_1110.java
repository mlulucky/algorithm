package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int originN = N;
    int count=0;
    do {
      N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
      count++;
    }
    while (originN != N);
    System.out.println(count);
  }
}

// 반복
// 26 -> 2+6
// 68
// 68 -> 6+8(14)
// 84
// 84 -> 8+4(12)
// 42
// 42 -> 4+2(6)
// 26
// 00 -> 0+0
// 00;


