package boj.silver;

import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_2164 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    LinkedList<Integer> list = new LinkedList<>();
    for(int i=1; i<=N; i++) {
      list.add(i);
    }
    while(list.size()>1) {
      int temp = list.remove(1); // 인덱스가 첫번쨰 요소를 temp 에 저장하고, list 에서는 삭제
      list.remove(0);
      list.addLast(temp);
    }
    System.out.println(list.get(0));
  }
}

// ArrayList : 인덱스를 이용한 데이터의 접근이 빠르다.
// LinkedList : 데이터의 추가 삭제가 빠르다.
