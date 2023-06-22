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


// eriol, NOAH
/*
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;

        int count = 1;
        if(a == b || a == c || b == c) {
            count++;
        }

        if(a == b && b == c) {
            count++;
        }

        for(int i = 1; i <= count; i++) {
            answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        }

        return answer;
    }

    private int pow(int a, int b) {
        if(b == 0) return 1;
        return a * pow(a, b-1);
    }
}
 */