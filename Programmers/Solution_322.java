// 문제 : 주사위 게임 3

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution_322 {

    public int solution(int a, int b, int c, int d) {

        HashMap<Integer, Integer> map = convertMap(a, b, c, d);

        // 네 주사위가 모두 같을경우
        if (map.containsValue(4)) {
            return getKey(map, 4) * 1111;
        } // 세 주사위가 같을경우
        else if (map.containsValue(3)) {
            return (int) Math.pow(10 * getKey(map, 3) + getKey(map, 1), 2);
        } // 두 주사위가 같을 경우
        else if (map.containsValue(2)) {
            // 두 주사위가 같고, 다른 두 주사위는 다를경우
            if (map.containsValue(1)) {
                List<Integer> keyList = new ArrayList<Integer>();

                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(1)) {
                        keyList.add(entry.getKey());
                    }
                }

                return keyList.get(0) * keyList.get(1);
            } // 두 주사위 씩 같을 경우
            else {
                int p = Collections.min(map.keySet());
                int q = Collections.max(map.keySet());
                return (p + q) * Math.abs(p - q);
            }
        }

        // 이외의 경우 가장 작은 숫자를 반환
        return Collections.min(map.keySet());
    }

    private HashMap<Integer, Integer> convertMap(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        return map;
    }

    private int getKey(HashMap<Integer, Integer> map, int param) {
        int keyByValue = 0;

        for (Integer key : map.keySet()) {
            if (map.get(key).equals(param)) {
                keyByValue = key;
                break;
            }
        }

        return keyByValue;
    }
}
