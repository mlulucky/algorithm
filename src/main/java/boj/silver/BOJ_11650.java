package boj.silver;

import java.util.*;


public class BOJ_11650 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<int[]> list = new ArrayList<>();
    while(N-->0) {
      list.add(new int[]{sc.nextInt(),sc.nextInt()});
    }
    // 람다식 리스트 오름차순 정렬
    list.sort((arr1, arr2) -> (arr1[0] == arr2[0]) ? arr1[1] - arr2[1] : arr1[0] - arr2[0]);
    for(int[] point : list) {
      System.out.println(point[0] + " " + point[1]);
    }
  }
}

// x 가 같으면 y 값을 비교
// (o1[0] == o2[0]) ? Integer.compare(o1[1], o1[1])

// Comparator 클래스를 이용한 정렬
// Collections.sort(list, new Comparator<int[]>() { // 정렬
//  @Override
//  public int compare(int[] o1, int[] o2) { // 정렬 기준정의 메서드
//    int A = (o1[0] == o2[0]) ? Integer.compare(o1[1], o2[1]) : Integer.compare(o1[0], o2[0]); // 두 좌표의 0번째 요소(x) 를 기준으로 정렬
//    return A;
//  }
//});