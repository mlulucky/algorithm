package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_30802 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringTokenizer bundleCntTnP = new StringTokenizer(br.readLine());
    int Tbundle = Integer.parseInt(bundleCntTnP.nextToken()); // 티셔츠 묶음 수
    int Pbundle = Integer.parseInt(bundleCntTnP.nextToken()); // 펜 묶음 수
    int[] needTSizesArr = new int[6];

    for (int i = 0; i < 6; i++) {
      needTSizesArr[i] = Integer.parseInt(st.nextToken());
    }

    int tOrderCnt = 0, pOrderCnt, pCnt; // 티셔츠(묶음), 펜(묶음/자루) 주문 개수
    for (int tSize : needTSizesArr) { // 필요 티셔츠 수량은 총 0부터 N 만큼
      // 필요수량이 0 인 경우는 주문 X
      if (tSize > 0) {
        int bundle = tSize / Tbundle; // 몫: 묶음
        tOrderCnt += bundle;
        if (tSize % Tbundle != 0) { // 나머지가 있으면
          tOrderCnt++; // 나머지 1개도 무조건 한묶음으로 계산
        }
      }
    }

    pOrderCnt = N / Pbundle;
    pCnt = N % Pbundle;

    System.out.println("티 주문개수" + tOrderCnt);
    System.out.print("팬" + pOrderCnt + " " + pCnt);
  }
}

// 필요 티 9,  티 한묶음수 5
// 9 = 9/5 (몫) + (나머지) 나머지를 묶음으로 구매
// 몫 만큼 묶음 수 + 나머지가 있으면 + 1묶음

// 필요 펜 9(N명 개수),  펜 한묶음수 5
// 9 = 9/5 (몫) + (나머지) 나머지를 자루로 구매. (1묶음 + 4자루)


// 배열 값 초기화
// 향상된 for문: 값을 변경할 때는 복사본을 다루므로 배열 원본에는 영향을 주지 않습니다. (원본배열의 요소 값을 새로운 int 로 할당(대입))
// 기본 for문: 배열의 인덱스를 직접 다루기 때문에 배열의 값을 수정할 수 있습니다.