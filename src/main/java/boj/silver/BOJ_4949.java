package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_4949 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;
    while (!(input = br.readLine()).equals(".")) { // 반복문마다 br.readline 을 읽는다.
      String res = input.replaceAll("[^\\[\\]()]", ""); // [, ], (, ) 가 아닌 모든 문자를 "" 으로 변경
      if(res.isEmpty()) { // "" 빈 문자열인 경우 (괄호가 하나도 없는 경우)
        System.out.println("yes");
        continue;
      };

      String[] arr = res.split("");
      int[] nums = new int[arr.length]; // res: "" 빈문자열 -> arr: [""] 빈문자를 요소로 갖는 배열(배열길이 1) -> new int[1] => [0]
      for (int i = 0; i < arr.length; i++) {
        switch (arr[i]) {
          case "(":
            nums[i] = 1;
            break;
          case ")":
            nums[i] = -1;
            break;
          case "[":
            nums[i] = 2;
            break;
          case "]":
            nums[i] = -2;
            break;
        }
      }
      if(isBalanced(nums)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }

  private static boolean isBalanced(int[] nums) {
    Stack<Integer> stack = new Stack<>();
    for (int num : nums) {
      if (num > 0) {
        stack.push(num);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        int lasInNum = stack.pop();
        if (lasInNum + num != 0) {
          return false;
        }
      }
    }
    return stack.isEmpty(); // 모든 반복문 후 스택이 비어있다면 -> 짝이 맞았다는.
  }

}


// 조건1. 괄호는 짝을 이룬다 -> 괄호의 개수가 각각 짝수를 이루어야 한다.(개수 동일)
// 조건1을 만족하지 않으면 바로 'NO' 응답

// 조건2. 괄호가 짝수를 이루는 경우
// ] [ ) (  : (X)
// ([ ] 로 이루어져야함)
// 두 요소 사이에 개수(요소)가 짝수가 있어야 함. ( 배열에서 짝수 인덱스의 값만 확인)
// 6-7
// 5-8
// 1,3,5... idx 차이 1,3,5.. (앞의 인덱스는 0보다 커야함)

// 구분자만 남기고 문자열 제거

// 소괄호( ) : 문자클래스에 특별한 의미없이. 단순 문자로 취급. 이스케이프 문(\\) 필요x
// 대괄호[ ] : 특별한 의미. 이스케이프(\\) 처리 필요
// 가장 바깥 [ ] : 문자 클래스 의미
// [^ ] : 부정문자 클래스. 예) [^abc] : a,b,c 가 아닌 모든 문자

// 문자열.replace("변경할 문자","변경문자") : 원본 문자열을 변경하지 않고 새로운 문자열을 반환
// for( : ) 향상문 : 배열 요소에 대한 복사본. 원본 배열 값에 영향 x

// StringTokenizer st = new StringTokenizer(br.readLine(), "[] ()"); // [, ], (, ) 그리고 공백을 구분자로 갖는다.

// 빈문자열을 배열로 만들때 -> 배열길이는 1이 된다. 요소는 "" 빈문자열
//String test = "";
//String[] testArr = test.split("");
//    System.out.println(Arrays.toString(testArr));
//int[] testInts = new int[testArr.length];
//    System.out.println(Arrays.toString(testInts));
