// 문제 : 대충 만든 자판

import java.util.HashMap;

class Solution_229 {

    public int[] solution(String[] keymap, String[] targets) {

        int totalIdx;
        String[] value;
        int runCnt = targets.length;
        int[] result = new int[runCnt];
        HashMap<String, Integer> keyMap = setKeyMap(keymap, keymap.length);

        for (int i = 0; i < runCnt; i++) {
            totalIdx = 0;
            value = targets[i].split("");

            for (int j = 0; j < value.length; j++) {
                if (!keyMap.containsKey(value[j])) {
                    totalIdx = -1;
                    break;
                } else {
                    totalIdx += keyMap.get(value[j]);
                }
            }

            result[i] = totalIdx;

        }

        return result;
    }

    private HashMap<String, Integer> setKeyMap(String[] keyMap, int len) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] value;

        for (int i = 0; i < len; i++) {
            value = keyMap[i].split("");

            for (int j = 0; j < value.length; j++) {
                if (map.containsKey(value[j]) && map.get(value[j]) > j) {
                    map.put(value[j], j + 1);
                } else if (!map.containsKey(value[j])) {
                    map.put(value[j], j + 1);
                }
            }
        }

        return map;
    }

}
