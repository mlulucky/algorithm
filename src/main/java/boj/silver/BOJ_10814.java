package boj.silver;

import java.util.*;

public class BOJ_10814 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Person> people = new ArrayList<>();
    while(N-- > 0) {
      people.add(new Person(sc.nextInt(), sc.next()));
    }
    people.sort(Comparator.comparingInt(Person::getAge));
    for(Person person : people) {
      System.out.println(person.getAge() + " " + person.getName());
    }
  }
}

class Person {
  int age;
  String name;
  Person(int age, String name) {
    this.age = age;
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
}

// 가입한 순서대로 정렬하고,
// 우선정렬은 나이가 적을수록 앞에오게끔 -> 오름차순

// 나이정렬 - 람다식
// people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

// 참고 번외문제풀이 _ person 객체를 사용안하는 법
// ArrayList[] arr = new ArrayList[]; // ArrayList 타입을 인자로 갖는 배열
// arr[i] = new ArrayList(); // [[],[],[]] -> [["hello", "world"], [...], ...]
// arr[sc.nextInt()].add(sc.next()); // arr[21].add("lucky"); -> 21번째 인덱스에 "lucky" 추가
// 나이정렬 -> 인덱스 for 문 출력
// for(int j=0; j<arr[i].size(); j++) System.out.println(i + " " + arr[i].get(j)) // i 는 나이(index) j 는 이름



