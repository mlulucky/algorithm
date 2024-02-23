package boj.silver;

import java.util.*;

public class BOJ_10866 {
  private static void appendString(StringBuilder sb, int n) {
    sb.append(n).append("\n");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>(); // LinkedList 는 Deque 인터페이스 구현
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    sc.nextLine(); // 개행문자 제거
    while (N-- > 0) {
      String[] arr = sc.nextLine().split(" ");
      switch (arr[0]) {
        case "push_front":
          deque.addFirst(Integer.parseInt(arr[1]));
          break;
        case "push_back":
          deque.addLast(Integer.parseInt(arr[1]));
          break;
        case "pop_front":
          appendString(sb, deque.isEmpty() ? -1 : deque.poll());
          break;
        case "pop_back":
          appendString(sb, deque.isEmpty() ? -1 : deque.pollLast());
          break;
        case "size" :
          appendString(sb, deque.size());
          break;
        case "empty" :
           appendString(sb, deque.isEmpty() ? 1 : 0);
           break;
        case "front" :
           appendString(sb, deque.isEmpty() ? -1 : deque.peekFirst());
          break;
        case "back" :
          appendString(sb, deque.isEmpty() ? -1 : deque.peekLast());
          break;
      }
    }
    System.out.println(sb);
  }
}

// 스택 : 바구니 - lifo(last in first out) 후입선출
// 큐 : 파이프 - fifo(first in first out) 선입선출
// 덱 : 스택 + 큐 - 앞에서, 뒤에서 모두 넣을 수 있고, 앞에서, 뒤에서 모두 뺄 수 있다.