// 문제 : 콜라츠 수열 만들기

import java.util.ArrayList;

class Solution_274 {

    public int[] solution(int param) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        resultList.add(param);

        while (param != 1) {
            param = param % 2 == 0 ? param / 2 : param * 3 + 1;
            resultList.add(param);
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

}