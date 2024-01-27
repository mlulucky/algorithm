package boj.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10250 {
  public static void main(String[] args) {
    // H: 층수 / W: 방개수 / N: 몇번째 손님
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    for (int t = 0; t < i; t++) {
      int H = sc.nextInt(); // 호텔의 층 수
      int W = sc.nextInt(); // 각 층의 방 수
      int N = sc.nextInt(); // 몇 번째 손님

      int floor = (N - 1) % H + 1; // 층 수 계산
      int room = (N - 1) / H + 1; // 호수 계산

      // 방 번호 출력
      System.out.println(floor * 100 + room);
    }
//    sc.nextLine();
//    while (i > 0) {
//      String A = sc.nextLine();
//      String B = sc.nextLine();
//      String[] aArr = A.split(" ");
//      String[] bArr = B.split(" ");
//      System.out.println(Arrays.toString(aArr));
//      System.out.println(Arrays.toString(bArr));
//      getRoomNumber(aArr);
//      getRoomNumber(bArr);
//      System.out.println(getRoomNumber(aArr));
//      System.out.println(getRoomNumber(bArr));
//      i--;
//    }
  }

  private static String getRoomNumber(String[] arr) {
    int[] numArr = new int[arr.length];
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = Integer.parseInt(arr[i]);
    }
    int H = numArr[0]; // 층
    int W = numArr[1]; // 방개수
    int N = numArr[2]; // 번째손님

    // 방번호
    int a = N % W; // 나머지(층)
    System.out.println("a " + a);
    int b = N / W; // 호수
    System.out.println("b " + b);
    String roomNum;
    if (a == 0) {
      roomNum = "" + H + String.format("%02d", b);
    } else {
      roomNum = "" + a + String.format("%02d", b + 1);
    }
    return roomNum;
  }
}
