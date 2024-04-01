package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String reverseA = new StringBuilder(st.nextToken()).reverse().toString();
    String reverseB = new StringBuilder(st.nextToken()).reverse().toString();
    System.out.println(Math.max(Integer.parseInt(reverseA), Integer.parseInt(reverseB)));
  }
}
