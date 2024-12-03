package boj.silver;

import java.io.*;
import java.util.*;

public class BOJ_25206 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    List<Major> majors = new ArrayList<>();
    for (int i=0; i<20; i++) {
      st = new StringTokenizer(br.readLine());
      String subject = st.nextToken(); // 과목명
      String point = st.nextToken(); // 학점
      String grade = st.nextToken(); // 등급
      majors.add(new Major(subject, point, grade));
    }

    double pointSum = 0; // 학점총합
    double sum = 0; // 학점 x 과목 등급점수

    for (Major major : majors) {
      if(major.grade.equals("P")) {
        continue;
      }
      sum += Double.parseDouble(major.point) * Score.getScore(major.grade);
      pointSum += Double.parseDouble(major.point);
    }
    double rating = sum / pointSum; // 평점
    System.out.printf("%.6f",rating); // 소수점 6자리까지 출력하고 반올림(%: 형식 지정의미, f: 소수점(실수) 의미)

  }

  static class Major { // 전공 클래스
    private String subject; // 과목
    private String point; // 학점
    private String grade; // 등급

    public Major(String subject, String point, String grade) {
      this.subject = subject;
      this.point = point;
      this.grade = grade;
    }

  }

  enum Score {
    A(4.5),
    A0(4.0),
    B(3.5),
    B0(3.0),
    C(2.5),
    C0(2.0),
    D(1.5),
    D0(1.0),
    F(0.0);

    private double score;

    Score(double score) {
      this.score = score;
    }

    private double getScore() {
      return score;
    }

    public static double getScore(String grade) {
      // grade 에 맞는 점수를 반환하기
      switch (grade) {
        case "A+":
          return A.getScore();
        case "A0":
          return A0.getScore();
        case "B+":
          return B.getScore();
        case "B0":
          return B0.getScore();
        case "C+":
          return C.getScore();
        case "C0":
          return C0.getScore();
        case "D+":
          return D.getScore();
        case "D0":
          return D0.getScore();
        case "F":
          return F.getScore();
        default:
          return 0;
      }
    }

  }
}
