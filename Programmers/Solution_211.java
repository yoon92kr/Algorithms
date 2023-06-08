// 문제 : 길이에 따른 연산
// 결과 : 성공
// Score : 100

public class Solution_211 {
    
    public int solution(int[] intArray) {
      int length = intArray.length;
      int result = intArray[0];

      if (length > 10) {
        for (int i = 1; i < length; i++) {
          result += intArray[i];
        }
      } else {
        for (int i = 1; i < length; i++) {
          result *= intArray[i];
        }
      }

      return result;
    }

}
