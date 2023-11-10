// 문제 : 주식가격

import java.util.HashMap;

class Solution_336 {

    public int[] solution(int[] prices) {

        int time = 1;
        int len = prices.length;
        HashMap<Integer, Integer> timeMap = new HashMap<Integer, Integer>();
        int[] result = new int[len];

        for (int i = len - 2; i >= 0; i--) {

            int downTime = 0;

            // 이후에 올 가격들 중 낮은 가격이 있을 경우 떨어진 시간에 추가한다
            for (Integer key : timeMap.keySet()) {
                downTime += key < prices[i] ? timeMap.get(key) : 0;
            }

            result[i] = time++ - downTime; // 가격이 유지된 시간을 구한 뒤 지난 시간 1초 증가
            timeMap.put(prices[i], timeMap.getOrDefault(prices[i], 0) + 1);

        }

        return result;

    }

}