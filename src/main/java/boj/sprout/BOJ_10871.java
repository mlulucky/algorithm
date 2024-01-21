package boj.sprout;

import java.util.Scanner;

public class BOJ_10871 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    sc.nextLine();
    if ((1 <= N && N <= 10000) && (1 <= X && X <= 10000)) {
      String A = sc.nextLine();
      String[] arr = A.split(" ");
      if (arr.length == N) {
        for (String value : arr) {
          int v = Integer.parseInt(value);
          if (v >= 1 && v <= 10000 && v < X) {
            System.out.println(v);
          }
        }
      }
    }
  }
}
