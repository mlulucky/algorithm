package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14681 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int c = x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);
    sb.append(c);
    System.out.println(sb);
  }
}
