// 문제 : 날짜 비교하기
// 결과 : 성공
// Score : 100

public class Solution_213 {
  
  public int solution(int[] date1, int[] date2) {
    int result = 0;

    for (int i = 0; i < 3; i++) {
        
      if (date1[i] == date2[i]) {
        continue;
      } else {
          result = date1[i] < date2[i] ? 1 : 0;
          break;
      }
        
    }
    
    return result;
  }
    
}
