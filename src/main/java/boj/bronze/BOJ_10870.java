package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_10870 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
    if(n >= 0) {
      list.add(0);
    }
    if(n >= 1) {
      list.add(1);
    }
    for (int i = 2; i <= n; i++) {
      list.add(list.get(i - 2) + list.get(i - 1));
    }
    System.out.println(list.get(n));
  }
}

// 고정 -------
// 0 - 0
// 1 - 1
// -------
// 반복
// n 번째 값 - (n-2)인덱스 값 + (n-1)인덱스 값
// 2 번째 값 = 0번째 + 1 번째
// 3 번째 값 = 1번째 + 2번째
// 4 번째 값 = 2번째 + 3 번째
// 5 번째 값 = 3번째 + 4번째
// ...
// 10 번째 값 = 8번째 + 9번째



