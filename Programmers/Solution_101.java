// 문제 : 배열 뒤집기
// 결과 : 성공
// Score : 100

class Solution_101 {

    public int[] solution(int[] param) {
        return reverse(param, param.length);
    }

    int[] reverse(int[] param, int len) {
        int[] result = new int[len];

        for(int i = 0 ; i < len ; i++) {
            result[i] = param[len - 1 - i];
        }
        return result;
    }

}
