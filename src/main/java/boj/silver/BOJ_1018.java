package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 세로 범위
    int M = Integer.parseInt(st.nextToken()); // 가로 범위
    // 주어지 보드판의 WB -> 읽어내서. 2차원배열로. 값 초기화시키기.
    String[][] board = new String[N][M];
    for (int i = 0; i < N; i++) {
      String line = br.readLine();
      for (int j = 0; j < M; j++) {
        board[i][j] = String.valueOf(line.charAt(j));
      }
    }

    int colorChangeCnt = Integer.MAX_VALUE; // 최소값을 구하기 위해 반대로 최대값을 선언.

    // 가능한 모든 8x8 범위 탐색
    // x,y 시작좌표 범위만큼 탐색(반복)
    for (int i = 0; i <= N - 8; i++) { // 행 10
      for (int j = 0; j <= M - 8; j++) { // 열 13
        String startPointColor = board[i][j]; // 8x8 시작좌표(왼쪽상단칸)
        String nextExpectColor = startPointColor.equals("W") ? "B" : "W";
        int cnt = 0;
        // 각 시작좌표의 8x8 칸(범위)의 색상을 체크
        for (int k = 0; k < 8; k++) { // i
          for (int l = 0; l < 8; l++) { // j
            // 각 칸 (board[k][l])
            // 짝수 좌표 일때 시작색상(board[i][j]), 아닌 경우(홀수일떄) 예상색상
            String expect = (k + l) % 2 == 0 ? board[i][j] : nextExpectColor;
            if (!board[i + k][j + l].equals(expect)) {
              cnt++;
            }
            // 처음시작하는 왼쪽상단칸(0,0)=짝수인덱스 가 색상이 검은색, 화이트에 따라서
            // -> 검은색 : 짝수는 검은색이고 홀수는 화이트
            // -> 화이트 : 짝수는 화이트이고 홀수는 검은색
          }
        }
        // 시작점을 임의로! 화이트, 블랙인 경우로 모두 비교 // b 경우 카운트 수 = (64 - a 경우의 카운트 수)
        cnt = Math.min(cnt, 64 - cnt); // 체스판 최대 경우의 수(64)
        colorChangeCnt = Math.min(colorChangeCnt, cnt);
      }
    }
    System.out.println(colorChangeCnt);
  }
}


// 체스판 다시 칠하기
// MxN 보드 -> 8x8 사이즈 체스판으로 만드는 경우.
// 주어진 수 N, M -> 가로 M, 세로 N (NxM)
// 보드를 체스판으로 칠해야할 만들 정사각형 최소개수를 구하기!

// 1. 최소개수의 경우를 구하기 - 반복문
// 모든 경우의 체스판 구하기 - 반복문

// 보드를 좌표로 만들기.
// 좌표의 범위는 8x8 사이즈
// 1. 주어진 보드에서 체스판(8x8) 의 경우에 대하여 반복문으로 체킹
// 2. 해당 범위에서 좌우의 보드 색상을 체크하기
// 3. 색상이 다른경우 ok, 같은경우 -> 반대되는 색상으로 변경 - 색칠한 갯수 체크+
// 4. 다시 1 ~ 3. 반복
// 모든 반복을 끝내고. 색칠개수가 가장 적은 값을 반환


// StringTokenizer 공백으로 나눈 각 단어를 "토큰"으로 간주하고 그 단위를 반환

// 반복문 - 체스판 범위(8x8) 경우의 수
// xy - xy(너비가 8이 되는 가로범위인덱스까지, 세로가 8이 되는 세로범위 인덱스까지)
// (0,0) - (8,8)
// (1,0) - (9,8)
// (2,0) - (10,8)
// ...
// (0,1) - (8,9)
// (1,1) - (9,9)
// (2,1) - (10,9)
// ...

// 이중 하나의 경우 - 각 경우마다, 하나의 판의 색상을 체크하기 위한 반복문
// 색상이 다르면 색을 칠하고 카운트 한다.
// 예) (2,1) - (10,9)  // x: 2, y:1
// (2,1), (3,1), ... (10,1) // (x + 1, y)
// (2,2), (3,2), ... (10,2) // (x + 1, y + 1)
// ...
// (2,9), (3,9), ... (10,9)




