package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] numArr = {1,1,2,2,2,8};
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int num : numArr) {
      int n = Integer.parseInt(st.nextToken());
      sb.append(num-n).append(" ");
    }
    System.out.println(sb);
  }
}

// 킹, 퀸, 룩, 비숍, 나이트, 폰

