package boj.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_14502 {
  static int N, M;
  static int[][] square;
  static boolean build = false;
  // 상하좌우 좌표 - 상우하좌 (북,동,남,서) 방향
  static int[][] dXY = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
  static int maxSafeArea = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken()); // 행 // 세로길이(column)
    M = Integer.parseInt(st.nextToken()); // 열 // 가로길이(row)
    square = new int[N][M];

    // 직사각형의 입력값을 가진다. -> 한줄의 입력값(0,1,2) 를 배열에 대입. 배열로 초기화
    for (int i = 0; i < square.length; i++) { // 행
      st = new StringTokenizer(br.readLine()); // 행을 한줄로 읽기 // 문자열을 한글자(토큰)씩 읽는다.(기본 구분자 공백) -> nextToken() 으로 호출
      for (int j = 0; j < square[i].length; j++) { // 열
        square[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // 벽 세우고 & 바이러스 확산 & 0(안전구역) 카운트
    buildWall(0);
    System.out.println(maxSafeArea);

  }

  // 벽 세우고 & 바이러스 확산 & 0(안전구역) 카운트
  static void buildWall(int 벽) {
    // 1. 벽개수 카운트가 3 일때
    // 바이러스 확산, 0 의 개수 카운트
    if (벽 == 3) {
      spreadVirusAndCountZero();
      return; // buildWall() 메소드 종료
    }

    // 2. 벽 세우기(반복 - BFS)
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (square[i][j] == 0) {
          square[i][j] = 1;
          buildWall(벽 + 1); // 벽 세우기 // count==3 일때 return(종료) 시 여기 호출메서드로 돌아와. 다음 코드 실행
          square[i][j] = 0; // 벽 다시 제거(원복)
        }
      }
    }
  }

  // 바이러스 확산, 0 의 개수 카운트
  private static void spreadVirusAndCountZero() {
    // boolean 배열의 기본값 false
    boolean[][] visited = new boolean[N][M]; // 방문여부 체크 - 이미 방문한 곳은 다시 방문하지 않도록. 불필요한 반복 줄이기
    Queue<int[]> XY = new LinkedList<>(); // xy 좌표 저장 // queue 구현체 LinkedList

    // 바이러스 위치를 큐에 저장
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (square[i][j] == 2) {
          XY.add(new int[]{i, j}); // 바이러스 위치
          visited[i][j] = true; // 방문체크 -> 바이러스 확산시. 이미 확산한 위치는 다시 확산 안하려고.
        }
      }
    }

    // 바이러스 위치인 경우 (조건)
    // 바이러스 위치 XY 요소가 빌때까지 반복
    while(!XY.isEmpty()) {
      // 바이러스 확산
      int[] 현재좌표 = XY.poll(); // 요소를 빼낸다.(요소가 한개 준다.)
      int x = 현재좌표[0];
      int y = 현재좌표[1];

      for (int k = 0; k < dXY.length; k++) {
        // 상하좌우 좌표
        int nX = x + dXY[k][0]; // x 좌표
        int nY = y + dXY[k][1]; // y 좌표

        // 바이러스좌표에서 상하좌우 좌표가 빈칸인 경우 & 방분여부 확인
        if (nX >= 0 && nY >= 0 && nX < N && nY < M && square[nX][nY] == 0 && !visited[nX][nY]) {
          // 바이러스 확산 // square[nX][nY] = 2 로, 배열 요소를 직접 변경하지 않고 방문여부로 체크만
          XY.add(new int[]{nX, nY}); // 바이러스 위치를 큐에 저장 -> 바이러스 확산 반복문 추가
          visited[nX][nY] = true; // 방문체크 -> 바이러스 확산시. 이미 확산한 위치는 다시 확산 안하려고.
        }
      }
    }

    // 안전구역(0)의 개수 카운트
    int safeAreaCount = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        // 빈칸_안전구역(0) 이면서 방문하지 않은 구역
        if (square[i][j] == 0 & !visited[i][j]) safeAreaCount++;
      }
    }
    maxSafeArea = Math.max(maxSafeArea, safeAreaCount);
  } // 바이러스 확산 및 0 개수 카운트

}

// 0 은 빈칸, 1은 벽, 2는 바이러스
// 바이러스는 상하좌우. 인접한 곳으로 퍼진다.
// 벽은 총 3개를 세워야 한다.

// ok 1. 직사각형의 입력값을 가진다. (N 세로, M 가로 ->  int[M][N]) -> 입력값대로 값을 초기화 한다.

// 2. 요소값이 2인 경우, 상하좌우의 값을 확인.
//    1. 0 인 경우 요소의 값을 1로 바꾼다.
//    2. 벽개수(3개) 를 카운트한다. +1
// 3. 벽개수가 3개가 될때
//    1. 요소값이 2인 경우. 상하좌우 값을 확인한다.
//    2. 0 인 경우 요소의 값을 2로 바꾼다.
//    3. 1 인 경우는 제외(return)

// 4. 직사각형의 총 0의 개수를 카운트 한다. - 저장
// 5. 2와 3의 경우를 반복하여. 0의 개수가 최대인 값을 구하기.

// --------------------------------------------------------
// 조건) *최대값 구하기 -> 경우의 수 만큼 벽 세우기 (반복)
// 1. N x M 만큼 반복

// 상하좌우 값을 확인
// (벽 세울때) - 반복문
// 0 인 경우 -> 값을 1(벽)로 변경
// 벽을 세울때는 count++, count 가 3 일때 바이러스 확산. 0 개수 구하기

// (바이러스 확산)
// 1, 2 인 경우 - 아무런 반응 x
// 0 인 경우 - 값을 2(바이러스)로 변경
// 변경 --> 값변경(배열변경) 하지 않고. 방문여부 체크만 적용 --> 바이러스 확산을 복원할 필요 없음

// 0 개수 세기
// --------------------------------------------------------


