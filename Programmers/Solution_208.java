// 문제 : 배열 만들기 1
// 결과 : 성공
// Score : 100

public class Solution_208 {

    public int[] solution(int limit, int base) {
        int[] answer = new int[limit / base];
        
        for(int i = 0 , j = base ; j <= limit ; j*=2, i++) {
            answer[i] = j;
        }

        return answer;
    }

}