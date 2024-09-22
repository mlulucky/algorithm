package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2446 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    int end = 2*N-1;
    int space = 0;
    for(int i = end; i >= 1; i -= 2) { // 9,7,5,3,1
      printStar(sb, space++, i);
      if(i==1) {
        space-=2;
        for(int k = 3; k<=end; k+=2) { // 3,5,7,9
          printStar(sb, space--, k);
        }
      }
    }
    System.out.println(sb);
  }

  private static void printStar(StringBuilder sb, int spaceCnt, int starCnt) {
    sb.append(" ".repeat(Math.max(0, spaceCnt)));
    sb.append("*".repeat(Math.max(0, starCnt))); // 별 개수만큼 * 찍기
    sb.append("\n");
  }
}


