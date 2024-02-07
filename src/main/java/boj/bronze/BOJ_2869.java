package boj.bronze;

import java.util.Scanner;
public class BOJ_2869 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int V = sc.nextInt();
    int day = (int) Math.ceil((double) (V - B) / (A - B));
    System.out.println(day);
  }
}
// day == (V - B) / (A - B);

//A: 달팽이가 올라가는 높이
//B: 달팽이가 미끄러지는 미터
//V: 나무 미터(높이)

// 첫날에는 c = A
// 2째날부터 c = A - B + A
// 나무 미터를 모두 올라가려면 며칠이 걸리는지
// -> 반복문의 경우 시간초과로 실패 -> 직접계산한 식으로 날짜 구하기

// 참조할만한 풀이
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입출력속도 빠름
//StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 문자열을 구분자로 나눈다.

//int A = Integer.parseInt(st.nextToken());
//int B = Integer.parseInt(st.nextToken());
//int V = Integer.parseInt(st.nextToken());

//int day = (V-B) / (A-B);
//if((V-B) % (A-B) != 0) day++;
//System.out.print(day);