package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10798 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int maxLength = 15; // 배열의 최대 크기를 미리 지정
    String[][] arr = new String[maxLength][5];

    for(int i=0; i<5;i++) {
      String[] strArr = br.readLine().split("");
      for(int j=0; j<strArr.length; j++) {
        arr[j][i] = strArr[j];
      }
    }

    // 2차원 배열 요소를 문자열로 추가하기.
    for(int i=0; i<arr.length; i++) {
      for(int j=0; j<arr[i].length; j++) {
        if(arr[i][j] != null) sb.append(arr[i][j]);
      }
    }

    System.out.println(sb);
  }
}


// 🐥 반복문 안에서 배열을 새로 정의하기
// 문제사항) 이미 생성된 배열의 크기는 고정되어 있다.
// 배열의 크기가 다른 배열을 재 할당하는 경우 ArrayIndexOutOfBoundsException 이 발생
// 배열을 반복문 안에서 매번 새로 생성하는 경우. 이전 배열이 남아있기 때문에. 새로 생성한 배열의 크기와 충돌하게 된다.
// (새로 정의된 배열의 크기가 기존 배열의 크기와 맞지 않으면 문제 발생)
// 해결방법) 고정된 배열의 크기를 사용(예상되는 최대 크기 미리 설정)

// 문제 코드
//for(int i=0; i<5;i++) {
//String[] strArr = br.readLine().split("");
//      if(arr == null) { // 매 반복문 처음에만 배열 새로 생성
//arr = new String[strArr.length][5]; // 🍒 문제
//    }
//    for(int j=0; j<strArr.length; j++) { // 1 ~ 15 개
//arr[j][i] = strArr[j];
//    }
//    }