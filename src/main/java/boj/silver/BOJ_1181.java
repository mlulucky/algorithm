package boj.silver;

import java.io.*;
import java.util.*;

public class BOJ_1181 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    List<String> li = new ArrayList<>();
    Set<String> st = new HashSet<>();
    int N = Integer.parseInt(br.readLine());
    while (N-- > 0) {
      String str = br.readLine().toLowerCase();
      st.add(str);
    }
    li.addAll(st);
    li.sort((a, b) -> {
      if (a.length() != b.length()) {
        return Integer.compare(a.length(), b.length());
      } else {
        return a.compareTo(b);
      }
    });

    for (String str : li) {
      bw.write(str + "\n");
    }
    bw.flush();
  }
}

// 참고할만한 번외 문제풀이
//TreeSet<String> set = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
//while(N-- > 0) set.add(sc.next());
//set.forEach(System.out::println);

// (Comparator.comparingInt(String::length) : 문자열 길이를 비교
// .thenComparing(String::compareTo) : 길이가 같을 경우 사전순으로 정렬
// set.forEach(System.out::println); : 트리셋에 저장된 모든 문자열을 출력, 정렬된 순서대로 출력

// 알파벳 정렬
// 길이가 짧은 것부터
// 길이가 같으면 사전 순으로
// 중복단어는 하나만 남기고 제거

// hashSet -> 중복값 불가
// 리스트 같은 곳에 넣어서, 정렬 ?
// 문자열의 length 가 짧은 것이 우선