package boj.bronze;

import java.util.*;

public class BOJ_2609 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Set<Integer> s = new TreeSet<>();
    List<Integer> li = new ArrayList<>();
    for(int i=1; i<=a; i++) {
      if(a%i == 0) s.add(i);
    }
    for(int i=1; i<=b; i++) {
      if(b%i == 0 && s.contains(i)) li.add(i);
    }
    int res = li.get(li.size()-1);
    int result = (a*b)/res;

    System.out.println(res);
    System.out.println(result);
  }
}

// 최대 공약수
// 12 - 1,2,3,4,6,12
// 18 - 1,2,3,6,9,18
// -> 공통약수 1,2,3,6 -> 가장 큰수 6
// 최소 공배수
// 12,24,36,48..
// 18,36,54,...
// -> 최소 공배수 36

// 1 17
// 1, 2, 3 ... 으로 나눴을때 0이 되면
// -> 배열에 넣음

// 최대 공배수는 ?
// 두수를 곱하고, 최대공약수로 나눈 나머지