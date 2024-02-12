package boj.bronze;

import java.io.*;

public class BOJ_10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int[] nums = new int[10001];
    for(int i=0; i<N; i++) {
      int num = Integer.parseInt(br.readLine());
      nums[num]++; // 1 을 3번 입력 -> nums[1] = 3 // num 에 입력한 수가 들어간다 -> 입력한 수의 최대값은 1만 -> nums[10000] 이 되야한다 -> 1~1만 범위 -> nums[10001]
    }
    for(int i=1; i<10001; i++) { // 정렬 // i 는 1부터 1만까지 범위
      while(nums[i] > 0) {
        bw.write(i + "\n");
        nums[i]--;
      }
    }
    bw.flush();
  }
}

// 첫째줄의 수 - 1000만
// 입력값 - 10000 이하 자연수