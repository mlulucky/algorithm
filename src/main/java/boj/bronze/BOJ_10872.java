package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int a = 1;
    for(int i=N; i>=1; i--) {
      a *= i;
    }
    System.out.println(a);
  }
}
// 10!
// 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1