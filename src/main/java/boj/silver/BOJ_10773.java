package boj.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_10773 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    while (K-- > 0) {
      int num = sc.nextInt();
      if (num != 0) {
        list.add(num);
      } else {
        list.remove(list.size() - 1);
      }
    }
    int sum = 0;
    for (int num : list) {
      sum += num;
    }
    System.out.println(sum);
  }
}
