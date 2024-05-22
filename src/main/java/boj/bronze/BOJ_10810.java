package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10810 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    while (M-- > 0) {
      StringTokenizer stt = new StringTokenizer(br.readLine());
      int startIndex = Integer.parseInt(stt.nextToken()) -1;
      int endIndex = Integer.parseInt(stt.nextToken()) -1;
      int K = Integer.parseInt(stt.nextToken());
      for (int i = startIndex; i <= endIndex; i++) {
        arr[i] = K;
      }
    }
    for (int k : arr) {
      sb.append(k).append(" ");
    }
    System.out.println(sb);
  }
}
