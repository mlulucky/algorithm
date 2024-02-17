package boj.bronze;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_11022 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int T = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= T; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int sum = A + B;
      sb.append(String.format("Case #%d: %d + %d = %d\n", i, A, B, sum));
    }
    System.out.println(sb);
  }
}
