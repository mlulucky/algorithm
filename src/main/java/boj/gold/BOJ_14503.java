package boj.gold;

import java.util.Scanner;

public class BOJ_14503 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    // 현재좌표(r,c), 방향(d) // r: 줄(y), c: 칸(x)
    int y = sc.nextInt();
    int x = sc.nextInt();
    int d = sc.nextInt();
    // 전체좌표의 값 배열로 보관 [][]
    int[][] xyArr = new int[N][M]; // 선언
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        xyArr[i][j] = sc.nextInt();
      }
    }
    // 현재좌표(x,y)를 기준으로 주변 4칸의 좌표가 되기위해서는
    // 북(0)동(1)남(2)서(3) 배열 => 북(0,-1), 동(1,0), 남(0,1), 서(-1,0)
    int[][] dArr = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
    int 청소방 = 0;
    // 0 은 청소가 안된 빈방. 1 은 벽!!
    while (true) {
      // 1번 로직
      if (xyArr[y][x] == 0) { // 현재 위치 청소가 안된 빈방인 경우
        청소방++;
        xyArr[y][x] = 3; // 청소한 위치 표시
      }
      // 주변4칸 검사
      boolean cleand = false;
      for (int i = 0; i < dArr.length; i++) {
        // 🐥 시계 반대방향(90도) 회전
        switch (d) { // 북(0) 서(3) 남(2) 동(1)
          case 0:
            d = 3;
            break;
          case 1:
            d = 0;
            break;
          case 2:
            d = 1;
            break;
          case 3:
            d = 2;
            break;
        }
        // 변경좌표
        int dX = x + dArr[d][0];
        int dY = y + dArr[d][1];
        // 범위를 넘지않고(전진가능한지), 좌표의 값이 0(청소되지않은 빈칸) 인 경우
        if (dX >= 0 && dX < N && dY >= 0 && dY < M && xyArr[dX][dY] == 0) {
          // 전진(좌표변경)
          x = dX;
          y = dY;
          cleand = true; // 방향 이동 및 청소후, 다시 방향회전해야하므로. 0으로 초기화
          break; // 종료
        }
      }
      // 청소안된 빈칸이 없는경우 // 네방향 모두 회전완료(청소완료)
      if (!cleand) {
        // 바라보는 방향으로 후진좌표 // 북 y++ , 서 x++, 남 y--, 동 x--
        int bx = x;
        int by = y;
        switch (d) {
          case 0: // 북쪽을 바라볼 때
            by++;
            break;
          case 1: // 동쪽을 바라볼 때
            bx--;
            break;
          case 2: // 남쪽을 바라볼 때
            by--;
            break;
          case 3: // 서쪽을 바라볼 때
            bx++;
            break;
        }
        // 후진가능할때(범위 & 벽이 아닌 경우)
        if (bx >= 0 && bx < N && by >= 0 && by < M && xyArr[by][bx] != 1) {
          x = bx;
          y = by;
        } else {
          break; // 후진 못하는 경우 중지 // 가장 가까운 반복문(while) 종료(끝)
        }
      } // 청소가 끝난 경우
    } // while 반복문
    System.out.println(청소방);
  }
}


// N, M 자연수
// 현재좌표, 바라보는 방향 -> x, y, d
// 전체좌표의 값(N x M 좌표값)
// -> 이차배열로 담아서

// 바라보는 방향(동: 1, 서: 3, 남: 2, 북: 0)
// 방향 90 도 회전하는 법 (북 -> 서 -> 남 -> 동 -> 북...)
// 0 -> 3 -> 2 -> 1 -> 0

// 현재 좌표값에서 동,서,남,북 이동할때의 좌표의 값을 체크
// 현재 좌표에서 4칸을 검사
// 현재 칸 주변 4칸 중 청소되지 않은 빈칸을 체크
// 반복문(4번)

// 현재 좌표의 주변 4칸(북,서,남,동)을 검사 -> 반복문 4번
// 현재좌표(x,y)를 기준으로 주변 4칸의 좌표가 되기위해서는
// 북(0)동(1)남(2)서(3) 배열 => 북(0,-1), 동(1,0), 남(0,1), 서(-1,0)


// 청소되지 않은 빈칸 0
// x, y 좌표를 청소되지 않은 빈칸의 좌표로 변경

// 주변 4칸 중 빈칸 0 없는 경우
// 바라보는 방향으로 후진
// 북 y++ , 서 x++, 남 y--, 동 x--
// 후진의 좌표가 0 이면 후진(좌표 변경)
// 후진할수 없으면 작동중지.