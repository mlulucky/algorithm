package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 문자열 분리
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    // 두번째 줄을 읽어서 값들을 저장 (StringTokenizer 는 새로운 입력라인(각 줄을 읽을때)을 처리할때 객체를 새로 할당해야함)
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int closeNum = 0;
    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          int sum = arr[i] + arr[j] + arr[k];
          if(sum <= M && closeNum < sum) {
              closeNum = sum;
          }
        }
      }
    }
    System.out.println(closeNum);
  }
}


// 3장의 합을 구하기. 주어진 값을 넘지않으면서 최대한 가까운 값 구하기

// 5 6 7 8 9
// 5 6 7 = 18
// 5 6 8 = 19
// 5 6 9 = 20
// 6 7 8 = 21
// 6 7 9 = 22
// 6 8 9 = 23
// 7 8 9 = 24

// arr[0] + arr[1] + arr[2]
// arr[0] + arr[1] + arr[3]
// arr[0] + arr[1] + arr[4]
// arr[1] + arr[2] + arr[3]
// arr[1] + arr[2] + arr[4]
// arr[2] + arr[3] + arr[4]
