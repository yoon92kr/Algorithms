// 문제 : 주식가격

class Solution_336 {

    public int[] solution(int[] prices) {

        int len = prices.length - 1;
        int[] result = new int[len + 1];

        for (int i = 0; i < len; i++) {
            int time = 1;

            for (int j = i + 1; j < len; j++) {
                if (prices[i] > prices[j]) {
                    break;
                }
                time++;
            }

            result[i] = time;
        }

        return result;

    }

}