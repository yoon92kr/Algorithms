// 문제 : 홀짝 구분하기
// 결과 : 성공
// Score : 100

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_212 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int param = Integer.parseInt(br.readLine());
    String result = param % 2 == 0 ? "even" : "odd";

    bw.write(param + " is " + result);
    bw.flush();
    bw.close();
    br.close();
  }
}
