package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10817 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[3];
    for(int i=0; i<arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    System.out.println(arr[1]);
  }
}

// 두번째로 큰 정수 출력
// 배열 정렬(sort) 오름차순 하고, 가운데 요소 출력

// 참고할만한 풀이
// int result = A > B ? (A < C ? A : (B > C ? B : C)) : (A > C ? A : (B < C ? B : C));