package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2480_3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] strArr = str.split(" ");
    Arrays.sort(strArr);
    int a = Integer.parseInt(strArr[0]);
    int b = Integer.parseInt(strArr[1]);
    int c = Integer.parseInt(strArr[2]);
    if (a == b && a == c && b == c) {
      System.out.println(10000 + a * 1000);
    } else if (a == b || a == c) {
      System.out.println(1000+a*100);
    } else if (b == c) {
      System.out.println(1000+b*100);
    } else {
      System.out.println(c*100);
    }
  }
}
