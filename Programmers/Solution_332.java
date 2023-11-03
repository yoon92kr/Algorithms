// 문제 : 튜플

import java.util.ArrayList;
import java.util.Arrays;

class Solution_332 {

    public int[] solution(String strTuple) {

        String[] strArr = strTuple.replaceAll("\\},\\{", "|").replaceAll("[\\{\\}]", "").split("\\|"); // 배열 형태로 치환
        Arrays.sort(strArr, (String str1, String str2) -> str1.length() - str2.length());// 길이순 정렬

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < strArr.length; i++) {
            String[] val = strArr[i].split(",");

            for (int j = 0; j < val.length; j++) {
                /* list에 포함되지 않은 원소가 나타날 경우 추가한다 */
                if (!list.contains(val[j])) {
                    list.add(val[j]);
                    break;
                }
            }
        }

        /* int 배열로 변환 후 반환 */
        return list.stream().mapToInt(Integer::valueOf).toArray();

    }

}
