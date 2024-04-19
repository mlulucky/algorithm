package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2444 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int printCnt = 2 * N - 1;
    for(int i=1; i<=printCnt; i+=2) {
      sb.append(printStar(printCnt, i)).append("\n");
    }
    for(int i=printCnt-2; i>=1; i-=2) { // 7,5,3,1
      if(i == 1) {
        sb.append(printStar(printCnt, i));
        break;
      }
      sb.append(printStar(printCnt, i)).append("\n");
    }
    System.out.println(sb);
  }

  public static String printStar(int printCnt, int i) {
    String nullword = " ".repeat((printCnt - i)/2);
    return nullword + "*".repeat(i);
  }
}

// 공백 별개수
// 4 1
// 3 3
// 2 5
// 1 7
// 0 9
// 1 7
// 2 5
// 3 3
// 4 1
