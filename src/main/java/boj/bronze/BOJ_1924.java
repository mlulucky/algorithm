package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1924 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int month = Integer.parseInt(st.nextToken());
    int day = Integer.parseInt(st.nextToken());
    Calendar calendar = new Calendar(month, day);
    calendar.getDay();
  }

  static class Calendar {
    int month;
    int day;

    public Calendar(int month, int day) {
      this.month = month;
      this.day = day;
    }

    public void getDay() {
      int[] totalDays = {31,28,31,30,31,30,31,31,30,31,30,31};
      String[] weekDay = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

      int allDays = 0;
      for(int i=0; i<month-1; i++) {
        allDays += totalDays[i]; // 총 일수
      }
      allDays += day; // 입력받은 일

      System.out.println(weekDay[allDays%7]);;
    }

  }
}

// 2007 년
// 1월
// 월,화,수,목,금,토,일
// 1,2,3,4,5,6,7

// 7로 나눈 나머지로 요일 구하기.

// 월 -> 일수 31, 30, 28 구분 기준 -> 월의 총 일수를 구한다.
// 일 -> 7 로 나누어 요일 구하기

// 월
// 1 - 1, 8, 15, 22, 29
// 2 - 5(36), 12(43), 19(50), 26(57)
// 계속 더한다 -> 총 더한 일을 7로 나눈다.
// 해당월의 월요일이 어느일수로 시작하는지에 따라서 7로 나눈 나머지의 요일이 달라진다.