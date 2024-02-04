package boj.silver;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10828 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Stack<Integer> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    if(1<=N && N<=10000) {
      while (N-- > 0) {
        String order = sc.next();
        switch (order) {
          case "push":
            int x = sc.nextInt();
            stack.push(x);
            break;
          case "top":
            sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            break;
          case "size":
            sb.append(stack.size()).append('\n');
            break;
          case "empty":
            sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            break;
          case "pop":
            sb.append(stack.isEmpty()? -1 : stack.pop()).append('\n');
            break;
        }
      }
      System.out.println(sb.toString());
    }
  }
}

// ArrayList 는 시간 복잡도 O(N)
// Stack 클래스 는 시간복잡도 O(1) - Last In First Out

// System.out.println - 시간 복잡도를 증가 시킨다.
// StringBuilder - 출력할 내용을 모아 한번에 출력