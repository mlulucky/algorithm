package boj.bronze;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(M<45) {
            M = M + 60 - 45;
            H--;
        } else {
            M -= 45;
        }
        if(H < 0) H = 23;
        System.out.println(H + " " + M);
    }
}
// H M = 알람시간, 분
// 0:0 - 23:59
// 10:10 -> 45분전 설정 9:25