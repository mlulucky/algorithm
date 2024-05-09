package boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_10757 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] numStrs = br.readLine().split(" ");
    BigInteger A = new BigInteger(numStrs[0]);
    BigInteger B = new BigInteger(numStrs[1]);
    System.out.println(A.add(B));
  }
}

// br.read(): 단일문자(1 글자) 읽음