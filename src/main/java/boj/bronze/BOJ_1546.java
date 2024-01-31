package boj.bronze;

import java.util.Scanner;

public class BOJ_1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] numArr = new int[N];
    int max = 0;
    double sum = 0;
    if(N<=1000) {
      for(int i=0; i<N; i++) {
        numArr[i] = sc.nextInt();
        if(numArr[i] > max) max = numArr[i];
      }
      for(double num : numArr) {
        num = (num/max)*100;
        sum+= num;
      }
      double average = sum / numArr.length;
      System.out.println(average);
    }
  }
}

// 점수 최댓값 M
// 모든 점수 == 점수/M*100

// 새로운 평균을 구하는 프로그램

// 입력
// 첫째줄 - 시험본 과목개수 N // 1000 이하
// 둘째줄 - 현재성적 // 100 이하. 정수(0보다 큼)

// 출력
// 새로운 평균

// 배열로 담기

// 현재성적중 최댓값을 구한다.
// 각각의 성적을 최대값으로 나누어 100 을 곱한다.

// 평균은 각 점수를 더해서, 배열의길이로 나눈다

