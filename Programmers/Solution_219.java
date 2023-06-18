// 문제 : 두 수의 연산값 비교하기
// 결과 : 성공
// Score : 100

public class Solution_219 {
  
    public int solution(int a, int b) {

        int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int result2 = 2 * a * b;
        
        return Math.max(result1, result2);

    }
    
}
