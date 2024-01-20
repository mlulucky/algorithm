package boj.bronze;

import java.util.Scanner;

public class BOJ_2562 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[9];
    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < 9; i++) {
      int num = sc.nextInt();
      if (0 <= num && num < 100) {
        arr[i] = num;
        if(max<arr[i]) {
          max = arr[i];
          maxIndex = i+1;
        }
      }
    }
    System.out.println(max);
    System.out.println(maxIndex);
  }
}
