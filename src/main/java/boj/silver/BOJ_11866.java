package boj.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_11866 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    for(int i=1; i<=N; i++) {
      q.offer(i);
    }
    sb.append("<");
    while(q.size() > 1) {
      for(int i=0; i<K-1; i++) {
        q.offer(q.poll());
      }
      sb.append(q.poll());
      sb.append(", ");
    }
    sb.append(q.poll());
    sb.append(">");
    System.out.println(sb);
  }
}
