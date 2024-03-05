package boj.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_11651 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int N = sc.nextInt();
    List<int[]> list = new ArrayList<>();
    while(N-->0) {
      list.add(new int[]{sc.nextInt(), sc.nextInt()});
    }
    list.sort((arr1, arr2) -> arr1[1] == arr2[1] ? arr1[0] - arr2[0] : arr1[1] - arr2[1]);
    for(int[] arr : list) {
      sb.append(arr[0] + " " + arr[1] + "\n");
    }
    System.out.println(sb);
  }
}

// list.toArray() 반환타입은 Object[]
// Arrays.toString(Object[]) 는 주소값으로 출력된다.

// list.toArray 값 출력하기.
//Object[] ob = list.toArray();
//for(Object n : ob) {
//int[] arr = (int[]) n;
//  System.out.println(Arrays.toString(arr));
//}