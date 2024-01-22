package boj.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1152 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String[] strArr = text.split(" ");
    int count = (int)Arrays.stream(strArr).filter((str) -> !str.equals("")).count();
    System.out.println(count);
  }
}

// System.out.println(Arrays.toString(strArr));

// 마지막 공백은 상관없음.
//The Curious Case of Benjamin Button
//[The, Curious, Case, of, Benjamin, Button]

// The first character is a bank
//[, The, first, character, is, a, bank]

