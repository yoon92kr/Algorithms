// 문제 : 공배수
// 결과 : 성공
// Score : 100

public class Solution_214 {
  
  public int solution(int number, int n, int m) {

    return number % n == 0 && number % m == 0 ? 1 : 0;
      
  }
    
}
