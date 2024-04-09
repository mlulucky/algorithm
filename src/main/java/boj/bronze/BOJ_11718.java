package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11718 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int count = 0;
    while(true) {
      String str = br.readLine();
      if(str == null || str.isEmpty()) break;
      if(count < 100) {
        sb.append(str).append("\n");
        count++;
      }
    }
    System.out.println(sb);
  }
}

// 입력 -> 출력 (반복)

// 참조할만한 코드
// byte[] b = new byte[7000];
//	System.in.read(b);
//	System.out.println(new String(b).trim());

// Scanner sc = new Scanner(System.in);
// while(sc.hasNext()) System.out.println(sc.nextLine());