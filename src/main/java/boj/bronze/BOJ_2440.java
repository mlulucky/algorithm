package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2440 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    while(true) {
      for(int i=N; i>0; i--) {
        sb.append("*");
      }
      N--;
      if(N <= 0) break;
      sb.append("\n");
    }

    System.out.println(sb);
  }
}


// 참고
//for(int i=0; i<N; i++)
//  System.out.print("*".repeat(N-i)+"\n");