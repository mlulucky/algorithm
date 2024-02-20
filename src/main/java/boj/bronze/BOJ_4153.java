package boj.bronze;

import java.util.Scanner;

public class BOJ_4153 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(a == 0 && b == 0 && c == 0) break;
      int max = Math.max(a, Math.max(b,c));
      System.out.println(max*max == a*a + b*b + c*c - max*max? "right" : "wrong");
    }
  }
}

// a,b,c 중 어느 값이 가장 큰지(max인지) 알 수 없다.
// 그래도 Math.max 로 가장 큰값은 구할 수 있다. (그게 a,b,c 중 무엇인지 모를뿐)
// 세변의 제곱을 모두 더해서 가장 큰변의 제곱을 빼면 두변의 제곱의 합이 된다.
// 즉, max*max == a*a + b*b + c*c - max*max 이게 같으면 직각삼각혀이 된다.

// 각 입력에 대해 직각 삼각형인지 확인
// 맞다면 right, 아니면 wrong 출력

// 마지막줄에는 0 0 0 입력

// 참고할만한 번외 문제풀이
// 길이가 3인 배열을 만든다 -> 입력값을 담는다 -> 배열을 오름차순 정렬한다
// int[] arr = new int[3];
// for(int i=0; i<3; i++) arr[i] = sc.nextInt();
// Arrays.sort(arr) // 마지막 요소가 가장 큰 값이다.
// arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1] ? "right" : "wrong"

