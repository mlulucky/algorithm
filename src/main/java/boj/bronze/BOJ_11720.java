package boj.bronze;

import java.util.Scanner;

public class BOJ_11720 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String num = sc.next();
    int sum = 0;
    String[] arr = num.split("");
    if ((1 <= N && N <= 100) && arr.length == N) {
      for (int i = 0; i < N; i++) {
        sum += Integer.parseInt(arr[i]);
      }
      System.out.println(sum);
    }
  }
}

// next() 공백을 구분자로. 공백전까지 문자열을 반환
// nextLine() 한줄 입력전체, 줄바꿈전까지 문자열을 반환