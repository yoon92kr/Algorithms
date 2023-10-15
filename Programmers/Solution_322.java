// 문제 : 주사위 게임 3

import java.util.HashMap;

class Solution_322 {

    public int solution(int a, int b, int c, int d) {

        HashMap<Integer, Integer> map = convertMap(a, b, c, d);

        // 4주사위가 모두 같을경우
        if (map.containsValue(4)) {
            return getKey(map, 4) * 1111;
        } else if (map.containsValue(3)) {
            return (int) Math.pow(10 * getKey(map, 3) + getKey(map, 1), 2);
        } else if (map.containsValue(2)) {

        }

        return answer;
    }

    private HashMap<Integer, Integer> convertMap(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(a, map.getOrDefault(b, 0) + 1);
        map.put(a, map.getOrDefault(c, 0) + 1);
        map.put(a, map.getOrDefault(d, 0) + 1);

        return map;
    }

    private int getKey(HashMap<Integer, Integer> map, int param) {
        int keyByValue = 0;

        // 모든 키를 순회합니다.
        for (Integer key : map.keySet()) {
            // 키와 매핑된 값이랑 equals() 메서드에 전달된 값이랑 일치하면 반복문을 종료합니다.
            if (map.get(key).equals(param)) { // 키가 null이면 NullPointerException 예외 발생
                keyByValue = key;
                break;
            }
        }

        return keyByValue;
    }
}
