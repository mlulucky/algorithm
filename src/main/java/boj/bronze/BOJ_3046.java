package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R2 = S*2-R1;
        System.out.println(R2);
    }
}

// 두숫자와 평균을 이용해. 나머지 하나의 숫자 알아내기
