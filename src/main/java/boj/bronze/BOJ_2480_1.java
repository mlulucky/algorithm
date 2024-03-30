package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2480_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] numbers = new int[3];
    for(int i=0; i<numbers.length; i++) {
      numbers[i] = Integer.parseInt(st.nextToken());
    }
    int count = 0;
    int[] comm = new int[1];
    for(int i=0; i<numbers.length; i++) {
      for(int j=i+1; j<numbers.length; j++) {
        if(numbers[i] == numbers[j]) {
          comm[0] = numbers[i];
          count++;
        }
      }
    }
    if(count > 2) {
      System.out.println(10000 + comm[0]*1000);
    } else if (count >= 1) {
      System.out.println(1000 + comm[0]*100);
    } else {
      Arrays.sort(numbers);
      System.out.println(numbers[numbers.length -1]*100);
    }
  }
}
