package boj.silver;

import java.util.*;

public class BOJ_7568 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    List<int[]> list = new ArrayList<>();
    while(N-->0) {
      list.add(new int[]{sc.nextInt(), sc.nextInt()});
    }
    for(int[] people1 : list) {
      int rank = 1; // 1등부터 시작
      for(int[] people2 : list) {
        if(people1 == people2) continue; // 다시 반복문으로 돌아감.
        if(people1[0] < people2[0] && people1[1] < people2[1]) {
          rank++;
        }
      }
      sb.append(rank);
      sb.append(" ");
    }
    System.out.println(sb);
  }
}
