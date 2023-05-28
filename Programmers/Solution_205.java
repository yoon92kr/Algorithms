// 문제 : 정수 찾기
// 결과 : 성공
// Score : 100

public class Solution_205 {

    public int solution(int[] num_list, int n) {

        return hasNum(num_list, n) ? 1 : 0;
        
    }

    private boolean hasNum(int[] num_list, int n) {
        
        for(int i = 0;i<num_list.length; i ++) {
            if (num_list[i] == n) 
               return true;
        }

        return false;

    }
}