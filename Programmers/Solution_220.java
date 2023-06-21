// 문제 : 이어 붙인 수
// 결과 : 성공
// Score : 100

public class Solution_220 {
  
    public int solution(int[] num_list) {
        int runCnt = num_list.length;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < runCnt; i++) {
            if (num_list[i] % 2 == 0) {
                even.append(num_list[i]);
            } else {
                odd.append(num_list[i]);
            }
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
    
}
