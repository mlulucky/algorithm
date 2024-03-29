package boj.bronze;

import java.io.*;

public class BOJ_2742 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    while(N>0) {
      sb.append(N).append("\n");
      N--;
    }
    System.out.println(sb);
  }
}

// 반복문안에서 출력시 988ms
// 반복문 바깥에서 한번 출력시 228ms

