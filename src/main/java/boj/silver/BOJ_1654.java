package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1654 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken()); // 보유 랜선 개수
    int n = Integer.parseInt(st.nextToken()); // 필요 랜선 개수

    int[] kLengths = new int[k];
    long max = 0;

    // 보유한 랜선중 가장 큰 길이를 구한다.
    for(int i = 0; i < k; i++) {
      kLengths[i] = Integer.parseInt(br.readLine());
      if(kLengths[i] > max) {
        max = kLengths[i];
      }
    }

    // 이분 탐색
    long minLength = 1; // 가장 작은 값
    long maxLength = max;
    // 예상되는 랜선길이
    long expectLength = 0;

    // 중앙값을 기준으로 길이를 1씩 증가시켜가면서, 최대 나올수 있는 길이(최소길이 <= 최대길이 까지)의 모든 경우를 검사
    while(minLength<=maxLength) {
      long expectSum = 0; // 총 예상 랜선 개수

      // 중간길이(기준) -> 구하려는 최적의 길이
      long mid = (maxLength + minLength) / 2; // (가장큰값+가장작은값)/2

      for(int leng : kLengths) { // 보유한 랜선을 각각
        expectSum += (leng/mid); // 중간길이로 나눴을때 예상되는 총 개수 (랜선 1개 길이에서 나오는 예상 개수)
      }

      // 예상 랜선개수가 필요개수보다 크거나 필요개수와 같을 때!
      if(expectSum >= n) {
        expectLength = mid;
        minLength = mid + 1; // 랜선 한개의 길이를 더 길게해야함
      } else { // 예상 랜선개수가 필요개수보다 적은 경우, 랜선의 길이를 줄인다.
        maxLength = mid - 1;
      }
    }

    System.out.println(expectLength);
  }
}

// 최초 풀이 : 원하는 길이가 나올때까지 예상 랜선길이를 1씩 줄여간다.

// 개선 풀이
// 이분탐색 적용
