package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1158 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strArr = br.readLine().split(" ");
    int N = Integer.parseInt(strArr[0]);
    int K = Integer.parseInt(strArr[1]);

    Queue<Integer> queue = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    for(int i=1; i<=N; i++) {
      queue.offer(i); // 1 부터 N 까지 요소를 저장
    }

    // 큐의 요소를 모두 삭제할때까지 반복
    sb.append("<");
    while(!queue.isEmpty()) { // 큐에 요소가 없을때 까지. [4] 에서 종료
      for(int i=0; i<K-1; i++) {
        queue.offer(queue.poll()); // 0 부터 K-1 까지 요소를 제거. 제거한 요소를 큐에 추가. (원형구조 구현)
      }
      sb.append(queue.poll()); // k 요소를 삭제. sb 문자열에 추가
      if(queue.size()>=1) { // [4] -> [ ] 큐의 사이즈가 없으므로. "," 추가x
        sb.append(", ");
      }
    }
    sb.append(">");
    System.out.println(sb);
  }
}

// 요세푸스 문제
// 큐 - 원형이동 구현

// 큐보다 리스트,배열로 직접 구현하는 편이 성능적으로 더 좋다.
// 아직 큐를 직접 구현하기에는 쉽지않아, 다음에 다시 도전해보기..