package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] strArr = new String[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<strArr.length; i++) {
      strArr[i] = st.nextToken();
    }
    int count=0;
    String target = br.readLine();
    for(String str : strArr) {
      if(str.equals(target)) count++;
    }
    System.out.println(count);
  }
}

// 입력개수
// 입력
// 타겟 정수
// 타켓이 몇개인가
