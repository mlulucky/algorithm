package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1316 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int count = 0;
    while (N-- > 0) {
      String str = br.readLine();
      Map<Character, List<Integer>> map = new LinkedHashMap<>();
      for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (!map.containsKey(c)) {
          map.put(c, new ArrayList<>());
        }
        map.get(c).add(i); // h: [0], a: [1], p: [2,3], y: [4]
      }
      boolean isGroupWord = true;
      for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
        List<Integer> idxList = entry.getValue(); // 값 만 [0], [1,2]
        if (idxList.size() == 1) {
          continue;
        }
        for (int i = 1; i < idxList.size(); i++) {
          int diff = idxList.get(i) - idxList.get(i - 1);
          if (diff != 1) { // 인덱스의 차이가 1 이상이면 떨어져있는 것
            isGroupWord = false;
            break;
          }
        }
        if (!isGroupWord) {
          break; // for 문 종료
        }
      }
      if(isGroupWord) {
        count++;
      }
    }
    System.out.println(count);
  }
}