package boj.bronze;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_3052 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Integer> li = new HashSet<>();
    for(int i=0; i<10; i++) {
      int A = sc.nextInt();
      li.add(A%42);
    }
    System.out.println(li.size());
  }
}
