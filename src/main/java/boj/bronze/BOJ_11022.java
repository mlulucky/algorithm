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
      String numStr = sc.nextLine();
      String[] strArr = numStr.split(" ");
      int A = Integer.parseInt(strArr[0]);
      int B = Integer.parseInt(strArr[1]);
      int sum = A + B;
      sb.append(String.format("Case #%d: %d + %d = %d\n", i, A, B, sum));
    }
    System.out.println(sb);
  }
}
