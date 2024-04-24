package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_5597 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] submitNums = new String[28];
    for (int i = 0; i < 28; i++) {
      submitNums[i] = br.readLine();
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 30; i++) {
      if(!Arrays.asList(submitNums).contains(String.valueOf(i))) {
        sb.append(i).append("\n");
      }
    }
    System.out.println(sb);
  }
}
// 과제를 제출하지 않은 출석번호
// 전체 정렬 -> 없는 번호 체크
// 입력된 수 -> 배열로 저장.
// 1 ~  30 반복문으로, 숫자를 포함하는지 체크.
// 포함 안하는 경우의 수를 저장 (이미 오름차순반복문으로 실행중이라 별도 정렬은 필요X)

// 시간복잡도 hashSet > list 라고 하지만
// 테스트해보니 list 로 contains 조회하는게 속도는 더 빨랐음. (대신 메모리는 hashSet 이 좀더 적었다.)