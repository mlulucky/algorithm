package boj.gold;

import java.util.Scanner;

public class BOJ_14503 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    // 현재좌표(r,c), 방향(d)
    // R 은 세로, C 는 가로임
    int r = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    // 전체좌표의 값 배열로 보관 [][]
    int[][] xyArr = new int[N][M]; // 선언
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        xyArr[i][j] = sc.nextInt();
      }
    }
    // 현재좌표(r,c)를 기준으로 주변 4칸의 좌표가 되기위해서는
    // 북(0)동(1)남(2)서(3) 배열 => 북(-1,0), 동(0,1), 남(1,0), 서(0,-1)
    int[][] dArr = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int 청소방 = 0;
    // 0 은 청소가 안된 빈방. 1 은 벽!!
    while (true) {
      // 1번 로직
      if (xyArr[r][c] == 0) { // 현재 위치 청소가 안된 빈방인 경우
        청소방++;
        xyArr[r][c] = 3; // 청소한 위치 표시
      }
      // 현재칸의 주변4칸 검사
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
        int dR = r + dArr[d][0];
        int dC = c + dArr[d][1];
        // 범위를 넘지않고(전진가능한지), 좌표의 값이 0(청소되지않은 빈칸) 인 경우
        if (dR >= 0 && dR < N && dC >= 0 && dC < M && xyArr[dR][dC] == 0) {
          // 전진(좌표변경)
          r = dR;
          c = dC;
          cleand = true; // 방향 이동 및 청소후 다시
          break; // for 문 종료(while 문으로 이동)
        }
      }
      // 청소안된 빈칸이 없는경우 // 네방향 모두 회전완료(청소완료)
      if (!cleand) {
        // 바라보는 방향으로 후진좌표
        int bR = r;
        int bC = c;
        switch (d) {
          case 0: // 북쪽을 바라볼 때
            bR++;
            break;
          case 1: // 동쪽을 바라볼 때
            bC--;
            break;
          case 2: // 남쪽을 바라볼 때
            bR--;
            break;
          case 3: // 서쪽을 바라볼 때
            bC++;
            break;
        }
        // 후진가능할때(범위 & 벽이 아닌 경우)
        if (bR >= 0 && bR < N && bC >= 0 && bC < M && xyArr[bR][bC] != 1) {
          r = bR;
          c = bC;
        } else {
          break; // 후진 못하는 경우 중지 // 가장 가까운 반복문(while) 종료(끝)
        }
      } // 청소가 끝난 경우
    } // while 반복문
    System.out.println(청소방);
  }
}