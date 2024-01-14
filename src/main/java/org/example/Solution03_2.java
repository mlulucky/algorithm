package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution03_2 {
    private static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 문자를 읽는데 사용

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 문자열을 특정구분자를 기준으로 분리
            String op = st.nextToken();
            switch (op) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    list.add(x);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    int empty = list.isEmpty() ? 1 : 0;
                    System.out.println(empty);
                    break;
                case "pop":
                    int value = -1;
                    if (list.size() > 0) {
                        value = list.get(0);
                        list.remove(0);
                    }
                    System.out.println(value);
                    break;
            }
        }
    }
}
