// 문제 : 덧셈식 출력하기
// 결과 : 성공
// Score : 100

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_216 {
  
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String param[] = br.readLine().split(" ");

    bw.write(param[0] + " + " + param[1] + " = " + (Integer.parseInt(param[0]) + Integer.parseInt(param[1])));
    bw.flush();
    bw.close();
    br.close();
    }
    
}
