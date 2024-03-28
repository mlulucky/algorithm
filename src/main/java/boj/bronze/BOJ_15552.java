package boj.bronze;

import java.io.*;

public class BOJ_15552 {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StreamTokenizer st = new StreamTokenizer(System.in);
    st.nextToken();
    int T = (int) st.nval;
    while(T-->0) {
      st.nextToken(); // 입력한 값을 가져옴
      int a = (int) st.nval;
      st.nextToken();
      int b = (int) st.nval;
      int sum = a + b;
      bw.write(sum + "\n");
    }
      bw.close();
  }
}

// 빠른 A + B

// BufferedWriter
// bw.write() : 버퍼에 저장. bw.write(string 타입)
// bw.flush() : 스트림을 닫지 않고, 데이터를 출력하고 싶을때 사용
// bw.close() : 내부적으로 bw.flush() 를 호출 후 bw 리소스 해지

// StringTokenizer(br.readLine()); : 줄단위로 읽은 데이터를 공백을 기준으로 나눈다.

// StreamTokenizer(System.in);
// StreamTokenizer 가 StringTokenizer 보다 빠른 이유
// : 데이터 전체를 한번에 처리. (한번에 여러문자 처리) 대용량 데이터 처리용
// : 토큰을 읽을때 내부적으로 변환하여 저장하므로. 효율적. (숫자 변환과정이 필요x)
// st.nval : double타입. 토큰이 숫자인 경우 숫자값 저장
// st.sval : String 타입. 토큰이 문자열인 경우 문자열값 저장
// StringTokenizer : 848ms
// StreamTokenizer : 624ms

// 🐥 BufferedReader 와 StreamTokenizer 동시사용 에러
// 입력스트림(System.in)으로부터 데이터를 읽어오는데, 이 두 객체가 동일한 입력스트림을 공유하여 문제 발생
// 버퍼링된 데이터를 StreamTokenizer 가 접근할 수 없음.