// 문제 : 문자열 돌리기
// 결과 : 성공
// Score : 100

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_210 {
    
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] splitParam = br.readLine().split("");
    
            for(int i = 0 ; i < splitParam.length;i++) {
                bw.write(splitParam[i]);
                bw.newLine();
            }
            
            bw.flush();
            bw.close();
            br.close();
        }

}
