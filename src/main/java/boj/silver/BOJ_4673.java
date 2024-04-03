package boj.silver;

public class BOJ_4673 {
  public static void main(String[] args) {
    boolean[] arr = new boolean[10001];
    StringBuilder sb = new StringBuilder();
    for(int i=1; i<=10000; i++) {
      if(생성자결과(i)<=10000) {
        arr[생성자결과(i)] = true;
      }
    }

    for(int i=1; i<=10000; i++) {
      if(!arr[i]) {
        sb.append(i).append("\n");
      }
    }
    System.out.println(sb);
  }
  public static int 생성자결과(int i) {
    int sum = i;
    while(i!=0) {
      sum = sum + i%10;
      i = i/10;
    }
    return sum;
  }
}


// 생성자 결과
// 123 -> 123 + 1 + 2 + 3 => 129 (각자리수를 더해야함)
// n: 123
// sum = sum + n % 10; // 123 + 3
// n = n/10; // 12
// sum = sum + n % 10; // sum + 2
// n = n/10; // 1
// sum = sum + n % 10; // sum + 1
// n = n/10; // 0 -> 종료
