package boj.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_9205 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());

    while (testCase-- > 0) {
      int n = Integer.parseInt(br.readLine()); // n: 편의점 개수
      List<int[]> list = new ArrayList<>();
      // 좌표 셋팅 -> 배열생성
      for (int i = 0; i < n + 2; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        list.add(new int[]{x, y}); // 케이스별 주어진 좌표
      }

      boolean[] visited = new boolean[n + 2]; // 전체 좌표의 방문여부 체크
      Queue<int[]> queue = new LinkedList<>();
      queue.offer(list.get(0)); // 집
      visited[0] = true; // 집(시작점) 방문처리

      bfs(queue, list, visited);
      if (visited[n + 1]) { // 목적지에 방문 여부가 true 이면
        System.out.println("happy");
      } else {
        System.out.println("sad");
      }

    }

  }

  // bfs 탐색 -> 큐 활용
  static void bfs(Queue<int[]> queue, List<int[]> list, boolean[] visited) {
    while (!queue.isEmpty()) {
      int[] xy = queue.poll();
      int x = xy[0];
      int y = xy[1];

      for (int i = 1; i < list.size(); i++) {
        if (visited[i]) {
          continue;
        }
        int[] next = list.get(i);
        int nextX = next[0];
        int nextY = next[1];

        int distance = Math.abs(x - nextX) + Math.abs(y - nextY);
        if (distance <= 1000) { // 거리 1000 이하경우
          visited[i] = true;
          queue.offer(new int[]{nextX, nextY});
        }
      }
    }
  }

}

// 입력받기
// 첫째줄 - 테스트 케이스
// 테스트 케이스
// 첫번째 - 편의점 개수 n
// n+2 개 줄을 출력
// 1. 상근이집 좌표
// 2. n 개 편의점 좌표
// 3. 락페스티벌 좌표

// 거리계산 - 이동경로
// 집 -> 편의점 -> 편의점 -> n... -> 락 페스티벌
// 집 -> 편의점 (1번)
// 편의점 -> 편의점 (n번)
// 편의점 -> 락페스티벌 (1번)

// 일단 단순히 생각해서 주어진 좌표 순서대로 계산하기.

// 위 과정 반복하여 - 종착지에 도착가능하면 HAPPY 출력

// 좌표 순서간 거리비교 vs bfs 로 가능경로 탐색에 따른 결과 차이나는 예
//집: (0, 0)
//편의점1: (1000, 0)
//편의점2: (2000, 0)
//편의점3: (1000, 1000)
//편의점4: (2000, 1000)
//페스티벌: (3000, 0)
//이 경우 bfs는 "happy"를 출력. 왜냐하면 모든 가능한 경로를 탐색하여 (1000, 1000)과 (2000, 1000)을 거치지 않고도 목적지에 도달할 수 있는 경로를 탐색


