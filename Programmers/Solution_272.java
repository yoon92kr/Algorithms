// 문제 : 할 일 목록

import java.util.stream.IntStream;

class Solution_272 {

    public String[] solution(String[] todo_list, boolean[] finished) {

        // 완료하지 못한 일의 index 추출
        IntStream is = IntStream.range(0, todo_list.length).filter(i -> finished[i] == false);
        // index에 해당하는 값을 배열로 Return
        return is.mapToObj(i -> todo_list[i]).toArray(String[]::new);

    }

}