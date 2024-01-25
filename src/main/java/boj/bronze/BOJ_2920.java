package boj.bronze;

import java.util.Scanner;

public class BOJ_2920 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    String[] charArr = num.split(" ");
    String[] a = {"1","2","3","4","5", "6","7","8"};
    boolean ascending = true;
    boolean descending = true;
    for(int i=0; i<a.length; i++) {
      if(!charArr[i].equals(a[i])) {
        ascending = false;
      }
      if(!charArr[i].equals(a[a.length-1-i])){
        descending = false;
      }
    }

    if(ascending) {
      System.out.println("ascending");
    } else if (descending) {
      System.out.println("descending");
    } else {
      System.out.println("mixed");
    }
  }
}

// 1 ~ 8 순서대로 ascending
// 8 ~ 1 순서대로 descending
// 그 외 mixed