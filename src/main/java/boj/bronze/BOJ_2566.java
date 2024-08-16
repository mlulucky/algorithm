package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2566 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] board = new int[9][9];

    // max 를 최솟값으로 선언
    int max = Integer.MIN_VALUE;
    int maxRow = 0;
    int maxCol = 0;

    // 1행 - 1열,2열,3열,...9열 까지 대입
    for(int i=0; i<board.length; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0; j<board[i].length; j++) {
        board[i][j] = Integer.parseInt(st.nextToken());

        // 최대값 구하기. 최대값인경우. 행열 찾기
        if(board[i][j] > max) { // 행열의 값이 max(최솟값)보다 큰 경우
          max = board[i][j];
          maxRow = i+1;
          maxCol = j+1;
        }
      }
    }

    System.out.println(max);
    System.out.println(maxRow + " " + maxCol);

  }
}

// StringTokenizer
// 기본적으로 문자열 - 공백(띄어쓰기, 탭, 줄바꿈) 을 기준으로 나누어진다.
// 구분자 지정도 가능하다 예) new StringTokenizer("2023-08-17", "-");