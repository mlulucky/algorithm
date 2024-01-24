package boj.bronze;

import java.util.*;

public class BOJ_2577 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    if((100<=A && A<1000) && (100<=B && B<1000) && (100<=C && C<1000)) {
      int cal = A*B*C;
      String strNum = Integer.toString(cal);
      String[] strArr = strNum.split("");

      Map<String, Integer> countNum = new HashMap<>();
      for(String val : strArr) {
        countNum.put(val, countNum.getOrDefault(val, 0) + 1);
      }

      Set<String> keySet = countNum.keySet();
      int[] arr = new int[10];
      for(String key : keySet) {
        int i = Integer.parseInt(key);
        arr[i] = countNum.get(key);
      }

      for(int v : arr) {
        System.out.println(v);
      }
    }
  }
}

// A, B, C 자연수(1~ )를 입력받는다.
// A, B, C 100 보다 크거나 같고, 1000 보다 작다.
// int result = A x B x C 값을 구한다.
// 17037300
// -> hashset 중복값 불가.
// 값 추가 count + 1
// 추가 값추가 안되면 count + 1

// 값을 key 로 넣고, count 하기.

// 0, 1, 2, 3, 4, ...
