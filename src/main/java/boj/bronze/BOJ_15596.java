package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15596 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    for(int i=0; i<N; i++) {
     arr[i] = Integer.parseInt(br.readLine());
    }
    sum(arr);
  }

  public static long sum(int[] a) {
    long ans = 0;
    for (int num : a) {
      ans += num;
    }
    return ans;
  }
}

// a[0] = 5
// a[1] = 4
// a[2] = 3
// a[3] = 2
// a[4] = 1

//#include <vector>
//long long sum(std::vector<int> &a) {
//  long long ans = 0;
//  return ans;
//}
