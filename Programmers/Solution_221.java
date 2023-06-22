// 문제 : 주사위 게임 2
// 결과 : 성공
// Score : 100

public class Solution_221 {
  
    public int solution(int a, int b, int c) {
        int result = 0;

        if (a == b && b == c) {
            result = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c );
        } else if (a != b && b != c && a != c) {
            result = a + b + c;
        } else {
            result = (a + b + c) * (a*a + b*b + c*c );
        }

        return result;
    }
    
}
