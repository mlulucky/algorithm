package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();
    int count=0; // 현재 스택에 넣은 최대 숫자를 기억
    for(int i=0; i<N; i++) { // 2
      int x = Integer.parseInt(br.readLine());
      if(x > count) { // 현재 스택에 넣은 최대 숫자보다 현재 입력값이 큰 경우
        for(int j=count+1; j<=x; j++) {
          stack.push(j);
          sb.append("+\n");
        }
        count=x;
      } else if(stack.peek()!=x) { // 최상단 숫자가 현재 숫자와 다른 경우
        System.out.println("NO");
        return;
      }
      // 스택의 최상단 숫자와 현재 입력값이 같은 경우
      stack.pop();
      sb.append("-\n");
    }
    System.out.println(sb);
  }
}

// stack 출력하는 법
// Arrays.toString(stack.toArray());

// 1. 반복문 1회의 경우만 1부터 입력값까지 값을 추가.
// 값을 추가 - 마지막에 추가했던 값을 기억해야함 -> count
// 2. 입력한 값을 마지막 요소와 비교
// 2-1. 입력한 값과 동일한 경우 pop
// 2-2. 입력한 값이 큰 경우 - 마지막에 추가했던 값 이후 값을 추가
// 2-2-1. 입력한 값과 동일한 경우 pop
