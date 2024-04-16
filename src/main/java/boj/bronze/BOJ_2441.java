package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2441 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int count=0;
    while (true) {
      sb.append(" ".repeat(count)).append("*".repeat(N)).append("\n");
      N--;
      count++;
      if(N == 0) break;
    }
    System.out.println(sb);
  }
}

// 5
// ***** (전체) // 왼쪽은 공백(0)
//  **** (n-1) // 왼쪽은 공백(1)
//   *** (n-2) // 왼쪽은 공백(2)
//    ** (n-3) // 왼쪽은 공백(3)
//     * (n-4) // 왼쪽은 공백(4)


