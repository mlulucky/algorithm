package boj.silver;

import java.util.Scanner;

public class BOJ_9012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      String vps = sc.next();
      int count = 0;
      if (2 <= vps.length() && vps.length() <= 50) {
        for (int j = 0; j < vps.length(); j++) {
          count += vps.charAt(j) == '(' ? 1 : -1;
          if (count < 0) break;
        }
        System.out.println(count == 0 ? "YES" : "NO");
      }
    }
  }
}
