package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10818 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] strNums = br.readLine().split(" ");
    int min = 1000000; // 최대값을 최소값으로
    int max = -1000000;
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(strNums[i]);
      if(num < min) min = num;
      if(num > max) max = num;
    }
    System.out.println(min + " " + max);
  }
}

// Scanner 보다는 BufferedReader 가 더 빠르다.

//    Scanner sc = new Scanner(System.in);
//    int N = sc.nextInt();
//    if (1 <= N && N <= 1000000) {
//      int[] arr = new int[N];
//      for (int i = 0; i < N; i++) {
//        arr[i] = sc.nextInt();
//      }
//      int min = arr[0];
//      int max = arr[0];
//
//      for (int i = 0; i < N-1; i++) {
//        if(arr[i+1] < min) min = arr[i+1];
//        if(arr[i+1] > max) max = arr[i+1];
//      }
//      System.out.println(min + " " + max);
//    }
