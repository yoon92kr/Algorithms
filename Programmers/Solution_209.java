// 문제 : 문자열의 뒤의 n글자
// 결과 : 성공
// Score : 100

public class Solution_209 {

    public String solution(String param, int length) {
        
        return param.substring(param.length() - length);
        
    }


}