package boj.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1920 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Set<Integer> set = new HashSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    while(N-- > 0) {
      set.add(Integer.parseInt(st.nextToken()));
    }
    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    StringBuilder sb = new StringBuilder();
    while(M-- > 0) {
      int mNum = Integer.parseInt(st.nextToken());
      sb.append(set.contains(mNum) ? "1\n" : "0\n");
    }
    System.out.println(sb);
  }
}

// N 개 정수 -> X 라는 정수가 존재하는지 알아내기

// 자연수 개수
// 자연수A
// 자연수 개수
// 자연수B

// 자연수 B 가 자연수 A 에 존재하면 1 출력, 존재안하면 0 출력

