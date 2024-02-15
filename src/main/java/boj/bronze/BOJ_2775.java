package boj.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2775 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    List<int[]> list = new ArrayList<>();
    while(T-- > 0) {
      list.add(new int[]{sc.nextInt(), sc.nextInt()});
    }
    for(int[] arr : list) {
      int k = arr[0]; // 층
      int n = arr[1]; // 호
      int[][] apartment = new int[k+1][n+1]; // 0층을 포함하기 위해 -> 1층인 경우 층 개수는 0층, 1층 2개
      for(int i=0; i<n+1; i++) { // 0층 경우
        apartment[0][i] = i;
      }
      // 1층 이상의 경우
      for(int i=1; i<=k; i++) {// 층 마다 0층, 1층, 2층, 3층, 4층 ...
        for(int j=1; j<=n; j++) {
          apartment[i][j] = apartment[i-1][j] + apartment[i][j-1];
        }
      }
      System.out.println(apartment[k][n]);
    }
  }
}



// 0층 1호, 2호 ...... n 호 [0,1], [0,2], [0,3], [0,4]...
// 1층 1호, 2호 ...... n 호 [1,1], [1,2], [1,3], [1,4]...
// 2층 1호, 2호 ...... n 호 [2,1], [2,2], [2,3], [2,4]...
