// 문제 : 개미 군단
// 결과 : 성공
// Score : 100
public class Solution_119 {

	public int solution(int param) {

		int generalAnt = param / 5;
		int soldierAnt = (param - generalAnt * 5) / 3;
		int ant = param - generalAnt * 5 - soldierAnt * 3;

		return generalAnt + soldierAnt + ant;
	}

}