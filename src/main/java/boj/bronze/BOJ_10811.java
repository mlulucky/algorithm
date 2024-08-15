package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10811 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String firstLine = br.readLine();
    int[] numbers = calc(firstLine);
    int N = numbers[0]; // 바구니 개수
    int M = numbers[1]; // 횟수
    int[] buskets = new int[N]; // 바구니 배열
    for (int i = 0; i < N; i++) { // 바구니 배열 기본값 셋팅 // 1,2,.. N
      buskets[i] = i + 1;
    }

    while (M-- > 0) {
      String line = br.readLine();
      int[] lineArr = calc(line);
      int i = lineArr[0]; // 시작범위
      int j = lineArr[1]; // 마지막범위
      for (; i <= j; i++) { // i 부터 j 까지 범위
        int temp = buskets[i-1]; // 인덱스가 아니라.그냥 첫번째가 첫번째
        buskets[i-1] = buskets[j-1]; // i = j // i+1 = j -1 // i+2 = j-2 ...
        buskets[j-1] = temp;
        j--;
      }
    }
    for(int n : buskets) {
      System.out.print(n + " ");
    }
    br.close();
  }

  private static int[] calc(String str) {
    String[] lineArr = str.split(" ");
    int[] result = new int[lineArr.length]; // 배열 길이 만들어주고.
    // 입력값으로 배열 초기화하기
    for (int i = 0; i < lineArr.length; i++) {
      result[i] = Integer.parseInt(lineArr[i]);
    }
    return result;
  }

}