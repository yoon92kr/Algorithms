// 문제 : 가장 많이 받은 선물

import java.util.HashMap;

class Solution_348 {

    public int solution(String[] friends, String[] gifts) {
        
        int histCnt = gifts.length;
        int firendCnt = friends.length;
        HashMap<String, HashMap<String, Integer>> giftsHist = new HashMap<String, HashMap<String, Integer>>();

        // 1. 기본 Map 생성
        for(int i = 0 ; i < firendCnt; i++) {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            giftsHist.put(friends[i], map);
        }
        
        for (int i = 0; i < histCnt; i++) {
            String[] splitStr = gifts[i].split(" ");

            if (giftsHist.containsKey(splitStr[0])) {
                gi
            }
        }

        int answer = 0;

        return answer;
    }

}