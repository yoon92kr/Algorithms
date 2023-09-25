// 문제 : 커피 심부름

class Solution_307 {

    private final String LATTE = "latte";
    private final int LATTE_PRICE = 5000;
    private final int AMERICANO_PRICE = 4500;

    public int solution(String[] order) {

        int runCnt = order.length;
        int totalCost = 0;

        for (int i = 0; i < runCnt; i++) {
            /* 라떼가 아닐경우 동일 금액으로 계산한다. */
            totalCost += order[i].indexOf(LATTE) != -1 ? LATTE_PRICE : AMERICANO_PRICE;
        }

        return totalCost;

    }

}