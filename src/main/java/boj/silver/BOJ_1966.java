package boj.silver;

import java.util.*;

public class BOJ_1966 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    while(X-- > 0) {
      int N = sc.nextInt(); // 문서개수
      int idx = sc.nextInt(); // 찾으려는 인덱스
      Queue<int[]> list = new LinkedList<>();
      for(int i=0; i<N; i++) {
        int important = sc.nextInt();
        list.add(new int[]{i, important});
      }
      // 첫번째, 두번째 요소 값 비교. 뒤로보내기 -> 반복
      // 값비교시 값이 크면 출력 및 count+1 (출력 카운트세기)
      int count = 0;
      while(!list.isEmpty()) {
        int[] current = list.poll(); // 첫번째 문서(현재)를 꺼내서 qrr 에 저장
        boolean isMax = true;
        for (int[] doc : list) { // 두번째 문서부터 비교 시작
          if (current[1] < doc[1]) { // 현재문서보다 중요도가 높은 문서가 있으면 // 모든문서를 비교
            isMax = false; // 현재문서는 최대값이 아니다.
            break;
          }
        }
        // 그렇지 않은경우
        if (!isMax) {
          list.offer(current); // 문서를 다시 큐에 저장 (마지막 뒤로 보내기)
        } else {
          // 값이 큰 경우
          count++;
          if (current[0] == idx) {
            System.out.println(count);
            break; // 가장 가까운 반복문(while) 종료
          }
        }
      }
    }
  }
}


// 문서개수가 1개인 경우는 출력순서는 1
// 문서개수가 4개이면
// 인덱스 0,1,2,3 을 큐에 순서대로 저장 => 3,2,1,0
// 중요도 1,2,3,4 를 큐에 저장 => 4,3,2,1

// 인덱스 -> key
// 중요도 -> value

// value 의 max 값을 체크

// 값이 가장 큰값인지 체크
// 아니면 뒤로 보내기
// 같으면 출력.
// 해당 과정을 count 하여 출력


// 큐 메서드
// 추가 : add(실패시 에러), offer(실패시 false)
// 삭제 : remove(),  poll() // 삭제값 반환
// 큐의 front 값을 반환 : element(), peek()
// 큐 크기 : size()
// 원소 존재여부 : contains();
// 공백여부 : isEmpty();
