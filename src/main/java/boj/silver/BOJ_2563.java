package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_2563 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    List<int[]> positions = new ArrayList<>();

    // x,y 좌표 리스트 저장
    for (int i = 0; i < N; i++) {
      String[] nums = br.readLine().split(" ");
      int x = Integer.parseInt(nums[0]);
      int y = Integer.parseInt(nums[1]);
      positions.add(new int[]{x, y});
    }

    // 최대 x, y 좌표 계산 - 중복체크
    int maxX = 0;
    int maxY = 0;
    for (int[] pos : positions) {
      maxX = Math.max(maxX, pos[0] + 10);
      maxY = Math.max(maxY, pos[1] + 10);
    }

    // 도화지 배열 // 겹치는 영역 - 중복체크용
    boolean[][] board = new boolean[maxX][maxY];

    int overlap = 0;

    // 색종이 영역
    for (int[] pos : positions) {
      int x1 = pos[0];
      int y1 = pos[1];
      // 색종이(10x10) 겹침 체크
      for (int x = x1; x < x1 + 10; x++) { // 굳이 dx 선언해서 해야하나? 현재 x 에서 +10 까지 ?
        for (int y = y1; y < y1 + 10; y++) {
          if (board[x][y]) {
            overlap++;
          } else {
            board[x][y] = true;
          }
        }
      }
    }

    int total = N * 100;
    System.out.println(total - overlap);

  }
}
