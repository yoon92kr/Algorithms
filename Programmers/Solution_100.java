import java.util.Arrays;

// 문제 : 머쓱이보다 키 큰 사람
// 결과 : 성공
// Score : 100
class Solution_100 {

    public int solution(int[] array, int height) {
        
        return (int)Arrays.stream(array).filter(item -> item > height).count();
        
    }

}
