// 문제 : [PCCE 기출문제] 10번 / 데이터 분석

import java.util.Arrays;
import java.util.Comparator;

class Solution_340 {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        return Arrays.stream(data) // stream 생성
                .filter(intArr -> intArr[getIdx(ext)] < val_ext) // data의 값(ext) 중에서 기준값 (val_ext) 보다 작은 수 필터링
                .sorted(Comparator.comparingInt((int[] o) -> o[getIdx(sort_by)])) // data의 값(sort_by)를 오름차순 정렬
                .toArray(int[][]::new); // 2차원 int 배열 변환
    }

    /* 문자열에 해당하는 index 반환 */
    private int getIdx(String str) {
        switch (str) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
        }
        return 999;
    }

}