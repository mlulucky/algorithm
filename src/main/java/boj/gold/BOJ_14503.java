package boj.gold;

import java.util.Scanner;

public class BOJ_14503 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    // 현재좌표(x,y), 방향(d)
    int x = sc.nextInt();
    int y = sc.nextInt();
    int d = sc.nextInt();
    // 전체좌표의 값 배열로 보관 [][]
    int[][] xyArr = new int[N][M]; // 선언
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        xyArr[i][j] = sc.nextInt();
      }
    }
    // 현재 좌표의 주변 4칸(북,서,남,동)을 검사 -> 반복문 4번
    // 현재좌표(x,y)를 기준으로 주변 4칸의 좌표가 되기위해서는
    // 북(0,-1), 서(-1,0), 남(0,1), 동(1,0) => 배열로
    int[][] dArr = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    int 청소방 = 0;
    // 0 은 청소가 안된 빈방. 1 은 벽!!
    while (true) {
      boolean clean = false;
      // 1번 로직
      if (xyArr[x][y] == 0) { // 현재 위치 청소가 안된 빈방인 경우
        청소방++;
        xyArr[x][y] = 3; // 청소한 위치 표시
      }
      // 현재 좌표에서 주변 4칸(동,서,남,북)을 검사
      for (int i = 0; i < dArr.length; i++) {
        // 🐥 시계 반대방향(90도) 회전
        // 변경좌표
        int dX = x + dArr[i][0];
        int dY = y + dArr[i][1];
        // 범위를 넘지않고(전진가능한지), 좌표의 값이 0(청소되지않은 빈칸) 인 경우
        if (dX >= 0 && dX < N && dY >= 0 && dY < M && xyArr[dX][dY] == 0) {
          // 전진(좌표변경)
          x = dX;
          y = dY;
          clean = true;
          break; // 가장가까운 반복문 종료 -> for 문 종료
        }
      } // 주변 4칸 체크: 청소되지 않은 방

      // 청소안된 빈칸이 없는경우
      if(!clean) {
        // 바라보는 방향으로 후진좌표 // 북 y++ , 서 x++, 남 y--, 동 x--
        int bX = x;
        int bY = y;
        switch (d) {
          case 0:
            bY = y+1;
            break;
          case 1:
            bX = x-1;
            break;
          case 2:
            bY = y-1;
            break;
          case 3:
            bX = x+1;
            break;
        }
        // 후진가능할때(범위 & 벽이 아닌 경우)
        if (bX >= 0 && bX < N && bY >= 0 && bY <M && xyArr[bX][bY] !=1) {
          x = bX;
          y = bY;
        } else {
          break; // 후진 못하는 경우 중지 // 가장 가까운 반복문(while) 종료(끝)
        }
      } // 청소된방인경우
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

// 청소되지 않은 빈칸 0
// x, y 좌표를 청소되지 않은 빈칸의 좌표로 변경

// 주변 4칸 중 빈칸 0 없는 경우
// 바라보는 방향으로 후진
// 북 y++ , 서 x++, 남 y--, 동 x--
// 후진의 좌표가 0 이면 후진(좌표 변경)
// 후진할수 없으면 작동중지.