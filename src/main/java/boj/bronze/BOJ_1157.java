package boj.bronze;

import java.util.*;

public class BOJ_1157 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Map<Character, Integer> strCountMap = new HashMap<>();
    if(str.length()<=1000000) {
      for(char c : str.toCharArray()) {
        char upperChar = Character.toUpperCase(c);
        strCountMap.put(upperChar, strCountMap.getOrDefault(upperChar, 0) + 1);
      }
      int max = Collections.max(strCountMap.values());
      char maxChar = '?';
      for(Map.Entry<Character, Integer> map : strCountMap.entrySet()) {
        if(map.getValue() == max) {
          if(maxChar != '?') {
            maxChar = '?';
            break; // 반복문 종료
          }
          maxChar = map.getKey();
        }
      }
      System.out.println(maxChar);
    }
  }
}

// 문자열.toCharArray() : 문자열을 문자배열(char[])로 반환
// 문자열.split("") : 문자열을 문자열배열(String[])로 반환

// Character : char 의 오브젝트 타입

// Map.Entry 는 Map 에 저장된 key, value 를 쌍으로 나타냄
// entrySet() -> Map 에 저장된 키, 값을 Map.Entry 형태로 저장한 Set 컬렉션을 반환
// Map 자체는 순회할수 없지만, entrySet() 을 통해 반환된 set 은 map 에 저장된 key, value 를 반복문으로 순회할 수 있다.

// m i s s i s s i p i -> 저장
// -> hasSet 에 저장 -> m i s i p
