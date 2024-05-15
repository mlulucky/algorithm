package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_2738 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[][] A = new int[N][M]; // [행][열]
    int[][] B = new int[N][M];
    StringBuilder sb = new StringBuilder();

    makeFillArray(N,M,br,A);
    makeFillArray(N,M,br,B);

    for(int i=0; i<N; i++) {
      for(int j=0; j<M; j++) {
        sb.append(A[i][j] + B[i][j]).append(" ");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

  private static void makeFillArray(int N, int M, BufferedReader br, int[][] arr) throws IOException {
    for(int i=0; i<N; i++) { // 0, 1, 2
      StringTokenizer stt = new StringTokenizer(br.readLine());
      for(int j=0; j<M; j++) { // 3 -> j: 0,1,2
        arr[i][j] = Integer.parseInt(stt.nextToken());
      }
    }
  }


}

// StringTokenizer(String str) : 주어진 문자열을 토큰(" ")으로 분리하는 StringTokenizer 객체를 생성합니다.
// 문자열 한줄을 공백으로 문자로 나눌 수 있다.
// 문자열 한줄당 StringTokenizer 인스턴스를 생성해야한다.

// Arrays.toString(2차원배열) : 주소값 출력
// Arrays.toString 는 1차원 배열에 대한 내용을 문자열로 변환 및 출력

// Arrays.deepToString() 메서드 이용. -> 2차원 배열 출력가능