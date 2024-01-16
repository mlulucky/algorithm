package boj.bronze;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_2372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setCount = sc.nextInt();
        Map<String, Integer> animalCount = new LinkedHashMap<>();
        for(int i=0; i<setCount; i++) {
            String animal = sc.next();
            int count = sc.nextInt();
            animalCount.put(animal, count);
        }

        System.out.println("\nAnimal\tCount");
        System.out.println("--------------");
        animalCount.forEach((key, value) -> {
            System.out.println("\n" + key + "\t" + value);
        });
    }
}

// 실제 제출 언어는 Ada 로 아래와 같이 검색한 결과를 제출하였다.
//with Ada.Text_IO; use Ada.Text_IO;
//procedure program_alioolio is
//begin
//Put_Line("Animal      Count");
//Put_Line("-----------------");
//Put_Line("Chickens      100");
//Put_Line("Clydesdales     5");
//Put_Line("Cows           40");
//Put_Line("Goats          22");
//Put_Line("Steers          2");
//end program_alioolio;

