package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;

public class BOJ_10845 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    Deque<Integer> list = new LinkedList<>();

    Map<String, Consumer<StringTokenizer>> op = new HashMap<>();
    op.put("push", st -> list.add(Integer.parseInt(st.nextToken())));
    op.put("front", st -> appendFormat(sb, list.isEmpty() ? -1 : list.peekFirst()));
    op.put("back", st -> appendFormat(sb, list.isEmpty() ? -1 : list.peekLast()));
    op.put("size", st -> appendFormat(sb, list.size()));
    op.put("empty", st -> appendFormat(sb, list.isEmpty() ? 1 : 0));
    op.put("pop", st -> appendFormat(sb, list.isEmpty() ? -1 : list.pollFirst()));

    while (N-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String method = st.nextToken();
      op.get(method).accept(st);
    }
    System.out.println(sb);
  }

  private static void appendFormat(StringBuilder sb, int n) {
    sb.append(n).append("\n");
  }

}

// switch 문
//    while (N-- > 0) {
//      StringTokenizer st = new StringTokenizer(br.readLine());
//      String op = st.nextToken();
//      int X=0;
//      switch (op) {
//        case "push":
//          int n = Integer.parseInt(st.nextToken());
//          list.add(n);
//          continue; // 다음 반복으로 넘어감
//        case "front":
//          X = list.isEmpty() ? -1 : list.peekFirst();
//          break;
//        case "back":
//          X = list.isEmpty() ? -1 : list.peekLast();
//          break;
//        case "size":
//          X = list.size();
//          break;
//        case "empty":
//          X = list.isEmpty() ? 1 : 0;
//          break;
//        case "pop":
//          X = list.isEmpty() ? -1 : list.pollFirst();
//          break;
//      }
//      sb.append(X + "\n");
//    }
//    System.out.println(sb);

// Queue 를 구현한 LinkedList
// list.peek() : 맨앞에 위치한 값을 반환
// list.pollFirst() : 맨앞에 요소를 반환하고 제거

// Consumer - accept() : 정의한 동작을 수행

// StringTokenizer, split 메서드 장단점
// StringTokenizer
// 문자열을 여러 토큰으로 쉽게 나눌수 있다.
// 정규표현식 지원 X -> 복잡한 문자열 분리에 어려움이 있음

// split
// 정규표현식 지원 -> 복잡한 문자열 분리 가능
// 정규표현식에 익숙하지 않다면 사용하기 어려울 수 있음

// 개행문자
//Scanner의 nextInt() 메서드는 정수를 읽어올 때, 개행 문자(Enter 키)를 무시하지 않고 읽어들입니다.
// 그렇기 때문에 nextInt() 이후에 nextLine()을 호출하면 남아 있는 개행 문자가 읽혀져서
// 빈 문자열을 반환할 수 있습니다.
//예를 들어, 사용자가 "5"를 입력하고 Enter 키를 누르면,
// 입력 버퍼에는 "5\n"이 남아 있게 됩니다.
// nextInt()로 "5"를 읽은 후, nextLine()을 호출하면 개행 문자("\n")를 읽어서 빈 문자열을 반환합니다.
// sc.nextLine();를 추가하여 nextInt() 이후의 개행 문자를 소비한다.