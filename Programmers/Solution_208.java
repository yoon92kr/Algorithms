// 문제 : 배열 만들기 1
// 결과 : 성공
// Score : 100

public class Solution_208 {

    public int[] solution(int limit, int base) {
        int[] result = new int[limit / base];
        
        for(int i = 0 , j = base ; j <= limit ; j+=base, i++) {
            result[i] = j;
        }

        return result;
    }

}