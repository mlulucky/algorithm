package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2480_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] numbers = new int[3];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(st.nextToken());
    }
    int[] frequency = new int[7];
    for (int num : numbers) {
      frequency[num]++;
    }
    for (int i = 1; i < frequency.length; i++) {
      if (frequency[i] == 3) {
        System.out.println(10000 + i * 1000);
        return;
      } else if (frequency[i] == 2) {
        System.out.println(1000 + i * 100);
        return;
      }
    }
    Arrays.sort(numbers);
    System.out.println(numbers[2] * 100);
  }
}
