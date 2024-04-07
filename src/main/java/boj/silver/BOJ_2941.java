package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2941 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    for(String alphabet : alphabets) {
      str = str.replaceAll(alphabet, "C");
    }
    System.out.println(str.length());
  }
}

