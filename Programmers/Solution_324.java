// 문제 : 할인 행사

import java.util.HashMap;

class Solution_324 {

    int wantCnt;
    int[] number;
    String[] want;

    public int solution(String[] want, int[] number, String[] discount) {

        // 초기 데이터 생성
        int result = 0;
        wantCnt = want.length;
        this.want = want;
        this.number = number;
        int runCnt = discount.length - 9;
        HashMap<String, Integer> discountMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }

        for (int j = 0; j < runCnt; j++) {
            if (isBucketList(discountMap)) {
                result++;
            }

            if (runCnt - 1 == j) {
                break;
            }
            // 구매 희망 물품에 일치하지 않는 경우 다음 행사 품목을 discountMap에 포함시키고 이전 행사 품목을 삭제한다
            discountMap.put(discount[j], discountMap.get(discount[j]) - 1);
            discountMap.put(discount[j + 10], discountMap.getOrDefault(discount[j + 10], 0) + 1);
        }

        return result;
    }

    private boolean isBucketList(HashMap<String, Integer> discountMap) {

        for (int i = 0; i < wantCnt; i++) {
            // 10일간의 할인 품목이 구매를 원하는 항목의 갯수와 일치하지 않을 경우 false를 반환
            if (discountMap.getOrDefault(want[i], 0) != number[i]) {
                return false;
            }
        }

        return true;
    }

}