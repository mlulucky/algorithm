package boj.silver;

import java.util.*;

public class BOJ_10816 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer, Integer> cardMap = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      int n = sc.nextInt();
      cardMap.put(n, cardMap.getOrDefault(n, 0) + 1);
    }
    int M = sc.nextInt();
    while (M-- > 0) {
      int m = sc.nextInt();
      sb.append(cardMap.containsKey(m) ? cardMap.get(m) + " " : "0 ");
    }
    System.out.println(sb);
  }
}

// set 은 값만 저장 / 저장순서 유지 x / 중복값 허용 x
// sc.nextInt(); // 공백(스페이스바), 줄바꿈(엔터) 모두 구분자로 인식한다.

// cardMap.put(n, cardMap.getOrDefault(n, 0) + 1);
// cardMap.getOrDefault(n, 0) n 입력값을 키로 가질때, 해당 키에 대한 값을 가져온다. (n 을 키로 가지는 값이 없으면 기본값 0을 가져온다)
// 이후 n 을 키로 가지는 값을 가져와서 +1 을 한다.

// sb.append(cardMap.containsKey(m) ? cardMap.get(m) + " " : "0 ");
// cardMap 의 키가  M 의 요소를 포함할때 그 값을 출력