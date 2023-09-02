// 문제 : 글자 지우기

import java.util.Arrays;

class Solution_289 {

    public String solution(String my_string, int[] indices) {

        Arrays.sort(indices); // 제외할 원소의 index 정렬
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < indices.length; i++) {
            sb.deleteCharAt(indices[i] - i); // 원소를 삭제할 경우, index 가 한칸씩 앞으로 밀려야 하기떄문에 i만큼 빼준다.
        }

        return sb.toString();

    }

}