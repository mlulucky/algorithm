package boj.bronze;

import java.util.Scanner;

public class BOJ_2675 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int t=0; t<T; t++) {
      int R = sc.nextInt();
      String S = sc.next();
      String[] arr = S.split("");
      StringBuilder sb = new StringBuilder();
      if((1<=R && R<=8) &&(1<=arr.length && arr.length <=20)) {
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < R; j++) {
            sb.append(arr[i]);
          }
        }
      }
      System.out.println(sb);
    }
  }
}
