package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int X = Integer.parseInt(br.readLine());
    int sum=0;
    for(int i=1; i<=X; i++) {
      sum+=i;
      int start = sum-i+1;
      if(X<=sum && X>=start) {
        int diff = X - start;
        if(i%2==0) {
          System.out.println(1+diff + "/" + (i-diff));
        } else {
          System.out.println((i-diff) + "/" + (1+diff));
        }
        break;
      }
    }
  }
}

// i 가 짝수이면
// 1/i -> 2/i-1 -> 3/i-2..
// 1+diff / i-diff
// A + "/" + B
// 아니면
// i/1 > i-1/2 > i-2/3...
// i-diff / i+diff