package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2442 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int spaceCnt = N-1; // 공백 개수
    for(int i=1; i<=N; i++) {// 1,2,3
      String spaces = " ".repeat(spaceCnt--); // 2,1,0
      String stars = "*".repeat(2*i-1);
      System.out.println(spaces + stars);
    }
  }
}

// N 3을 찍으면
// i 1~3 까지
// i 1일때 별 1개(2*i-1) + 줄바꿈 (공백 2) // 공백 N-1
// i 2일때 별 3개(2*i-1) + 줄바꿈 (공백 1) // 공백 N-2
// i 3일때 별 5개(2*i-1) + 줄바꿈 (공백 0) // 공백 N-N

// repeat == 반복문 대체

//for(int i=1; i<=N; i++) {// 1,2,3
//    for(int j=0; j<N-i; j++) { // 2,1,0
//    sb.append(" ");
//  }
//  for(int k=0; k<2*i-1; k++) {
//     sb.append("*");
//  }
//  System.out.println(sb);
//  sb.setLength(0); // StringBuilder 초기화
//}