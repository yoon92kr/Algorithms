// 문제 : 가장 많이 받은 선물

import java.util.Arrays;
import java.util.HashMap;

class Solution_348 {

    public int solution(String[] friends, String[] gifts) {

        int histCnt = gifts.length;
        int firendCnt = friends.length;
        int[] giftScore = new int[firendCnt];
        int[] resultArr = new int[firendCnt];
        HashMap<String, HashMap<String, Integer>> giftsHist = new HashMap<String, HashMap<String, Integer>>();

        // 1. 기본 Map 생성
        for (int i = 0; i < firendCnt; i++) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            giftsHist.put(friends[i], map);
        }

        // 2. 선물 이력 설정
        for (int i = 0; i < histCnt; i++) {
            String[] splitStr = gifts[i].split(" ");

            if (giftsHist.get(splitStr[0]).containsKey(splitStr[1])) {
                giftsHist.get(splitStr[0]).put(splitStr[1], giftsHist.get(splitStr[0]).get(splitStr[1]) + 1);
            } else {
                giftsHist.get(splitStr[0]).put(splitStr[1], 1);
            }
        }

        // 3. 선물 지수 측정
        for (int i = 0; i < firendCnt; i++) {
            int sendCnt = 0, reCnt = 0;
            HashMap<String, Integer> map = giftsHist.get(friends[i]);

            // 3-1. 전달한 선물의 수 측정
            for (String val : map.keySet()) {
                sendCnt += map.get(val);
            }

            // 3-2. 받은 선물의 수 측정
            for (int j = 0; j < firendCnt; j++) {
                reCnt += giftsHist.get(friends[j]).getOrDefault(friends[i], 0);
            }

            // 3-3. 선물 지수 산출
            giftScore[i] = sendCnt - reCnt;
        }

        // 4. 다음 달에 받을 선물 측정
        for (int i = 0; i < firendCnt; i++) {
            String baseUser = friends[i]; // 측정 대상

            for (int j = 0; j < firendCnt; j++) {
                if (i == j) {
                    continue;
                }
                String targetuser = friends[j]; // 비교 대상
                int sendCnt = giftsHist.get(baseUser).getOrDefault(targetuser, 0); // 선물한 수
                int reCnt = giftsHist.get(targetuser).getOrDefault(baseUser, 0); // 선물받은 수

                if (sendCnt > reCnt) {
                    resultArr[i] += 1;
                } else if (sendCnt == reCnt && giftScore[i] > giftScore[j]) {
                    resultArr[i] += 1;
                }
            }
        }

        return Arrays.stream(resultArr).max().getAsInt();
    }

}