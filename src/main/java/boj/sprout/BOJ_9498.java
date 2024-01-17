package boj.sprout;

import java.util.Scanner;

public class BOJ_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'c';
        } else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println(grade);
    }
}
