package boj.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_15686 {
  static int minDistance = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); // N N 한줄을 읽음
    int N = Integer.parseInt(st.nextToken()); // 도시 너비 NxN
    int M = Integer.parseInt(st.nextToken()); // 수익을 내는 치킨집개수 (실제 계산에 필요는 없는듯)
    int[][] city = new int[N][N];

    for (int i = 0; i < city.length; i++) {
      st = new StringTokenizer(br.readLine()); // n 행
      for (int j = 0; j < city.length; j++) { // n 열
        city[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 1. 집, 치킨집의 좌표를 구한다. -> 배열에 저장한다.
    // 2. (반복문) 각 집마다 전체 치킨집과의 거리를 구한다. -> 최소값을 구한다 -> 최소값을 저장한다.
    List<int[]> houses = new ArrayList<>();
    List<int[]> chickenStore = new ArrayList<>();

    for (int i = 0; i < city.length; i++) {
      for (int j = 0; j < city.length; j++) {
        int dot = city[i][j];
        int r = i + 1;
        int c = j + 1;
        if (dot == 1) { // 집
          houses.add(new int[]{r, c});
        } else if (dot == 2) { // 치킨집
          chickenStore.add(new int[]{r, c});
        }
      }
    }

    boolean[] visited = new boolean[chickenStore.size()];
    재귀호출(0, visited, chickenStore, houses, M);

    System.out.println("최소 거리 : " + minDistance);
  }

  private static void 재귀호출(int start, boolean[] visited, List<int[]> chickenStore, List<int[]> houses, int M) {
    if (getStoreCount(visited) == M) {
      // 거리계산 + 종료
      calcDistance(visited, chickenStore, houses);
      return;
    }

    for (int i = start; i<visited.length; i++) {
      visited[i] = true;
//      System.out.println(Arrays.toString(visited));
      재귀호출(i + 1, visited, chickenStore, houses, M);
      visited[i] = false;
    }
  }

  private static int getStoreCount(boolean[] visited) {
    int count = 0;
    for (boolean visit : visited) {
      if (visit) {
        count++;
      }
    }
    return count;
  }

  // 최소거리 계산
  private static void calcDistance(boolean[] visited, List<int[]> chickenStore, List<int[]> houses) {
    int totalDistance = 0;

    // 전체 집 -> 각각의 집에서.
    for (int[] house : houses) {
      int minDistance = Integer.MAX_VALUE; // 각 집의 최소거리를 구하기위해. 최소값은 매번 초기화

      // 선택된 치킨집 거리계산
      for (int i = 0; i < visited.length; i++) { // 전체 치킨집이 아닌, true 인 조합에 대해서만!
        if (visited[i]) {
          int[] store = chickenStore.get(i);
          int diff = Math.abs(house[0] - store[0]) + Math.abs(house[1] - store[1]);
          minDistance = Math.min(minDistance, diff);
        }
      }
      totalDistance += minDistance;
    }
    minDistance = Math.min(minDistance, totalDistance);
  }

}
// 도시크기(NxN), 수익내는 치킨집개수 M
// 주어진 좌표에서 집, 치킨집 좌표 저장
// 각각의 거리를 비교

// 🔥 전체 치킨집 중 M 개의 조합을 구하는 것이 어렵다
// M 개의 치킨집 조합(선택) => 🐥 조합 == 백트래킹
// 각 집마다 치킨집 계산 -> 최소값 찾기
// 최소거리 합 구하기

// 총 치킨집에서 - M 개의 조합을 구하기
// 예) 치킨집 5개 중 2개(M개)의 조합 [t,t,f,f,f] -> boolean[] visited 배열로 구현
// M 개 만큼, 반복문을 중첩해서 계속 추가 -> 가독성 낮아지고, 코드가 비효율적
// for()
//   for()
//     for()....
// 🔥 재귀호출의 경우 - 모든 조합을 구할 수 있고, 🪄중첩된 반복문을 제거할 수 있다.

// 브루트 포스(완전탐색) : 모든 경우의 수를 탐색
// 백트래킹: 가능성 있는 대상만 탐색 (재귀방식으로 구현)