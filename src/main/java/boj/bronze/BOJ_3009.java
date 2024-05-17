package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_3009 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] xArr = new int[3];
    int[] yArr = new int[3];
    for(int i=0; i<3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      xArr[i] = Integer.parseInt(st.nextToken());
      yArr[i] = Integer.parseInt(st.nextToken());
    }
    int x = getUnique(xArr);
    int y = getUnique(yArr);
    sb.append(x).append(" ").append(y);
    System.out.println(sb);

  }

  private static int getUnique(int[] arr) {
    Set<Integer> numbers = new HashSet<>();
    Set<Integer> duplicate = new HashSet<>();
    for(int num : arr) {
      if(!numbers.add(num)) {
        duplicate.add(num);
      }
    }
    numbers.removeAll(duplicate);
    return numbers.iterator().next();
  }

}
