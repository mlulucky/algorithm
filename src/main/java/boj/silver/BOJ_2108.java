package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2108 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    for(int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(arr); // 오름차순 정렬

    // 평균
    double sum = 0;
    for(int n : arr) {
      sum += n;
    }
    int middle  = (int) Math.round(sum / N);
    sb.append(middle).append("\n");

    // 중앙값
    int idx = (arr.length-1)/2;
    sb.append(arr[idx]).append("\n");

    // 최빈값
    int MAX = 0;
    Map<Integer, Integer> arrCount = new HashMap<>();
    for(int n: arr) {
      arrCount.put(n, arrCount.getOrDefault(n, 0)+1);
    }

    List<Integer> keys = new ArrayList<>();
    for(int v : arrCount.values()) {
      if( v > MAX) {
        MAX = v;
      }
    }

    for(int key : arrCount.keySet()) {
      if(arrCount.get(key) == MAX) {
        keys.add(key);
      }
    }

    // 최빈값
    int[] keysArray = keys.stream().mapToInt(Integer::intValue).toArray();
    Arrays.sort(keysArray);
    int mode = keysArray.length > 1 ? keysArray[1] : keysArray[0];
    sb.append(mode).append("\n");

    // 범위 : 최소값 - 최대값 차이(0번째 인덱스 - 마지막 인데스요소)
    int maxV = arr[arr.length-1];
    int minV = arr[0];
    int range = maxV - minV;
    sb.append(range).append("\n");

    System.out.println(sb);
  }
}


// Arrays.sort(keys.toArray()); // Arrays.sort() 정렬이 적용이 안된다.
// List.toArray() => Object[] 반환 -> Integer[] 형변환 필요
// List 직접 정렬 : Collection.sort(keys)

// mapToInt : 스트림의 각 요소를 int 로 매핑하여 intStream 생성

// Math.round() : 소수점 반올림(0.5 이상) 예) 4.5 -> 5
// Math.ceil() : 소수점 이하값 무조건 올림(0.1 이상) 예) 4.1 -> 5
// Math.floor() : 소수점 이하값 무조건 내림 예) 4.1 -> 4
