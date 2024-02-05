package boj.silver;

import java.io.*;
import java.util.Arrays;

public class BOJ_2751 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[] numArr = new int[N];
    for(int i=0; i<N; i++) {
      int num = Integer.parseInt(br.readLine());
      numArr[i] = num;
    }
    Arrays.sort(numArr); // 오름차순 정렬
    for(int num : numArr) {
      bw.write(num + "\n");
    }
    bw.flush();
  }
}

//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//Integer[] arr = new Integer[n];
//for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
//Arrays.sort(arr);
//StringBuffer sb = new StringBuffer();
//for(int i : arr) sb.append(i + "\n");
//System.out.println(sb);

// 🍒 Scanner, System.out.println -> 시간초과 원인 가능
// -> StringBuffer, StringBuilder, BufferedReader, BufferedWriter 사용

// br.readLine() : 한줄 전체 읽기
// bw.write() : 인자로 전달된 정수를 문자로 처리
// -> 정수를 문자열로 변환하여 출력해야함.

// bw.flush() : 버퍼를 비워주기 -> 데이터를 출력

// BufferedReader : 한번에 여러 문자를 읽어
// BufferedWriter : 한번에 여러 문자를 출력
// StringBuilder, StringBuffer : 문자열 조작에 사용
// System.out.println : 간단한 콘솔출력사용
