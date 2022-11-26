// 문제 : 2016년
// 결과 : 성공
// Score : 100
public class Solution_35 {

	String[] DAYS = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
	int[] MONTHS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public String solution(int month, int day) {
		return getDay(month, day);
	}

	String getDay(int month, int day) {
		for (int i = 0; i < month; i++) {
			day += MONTHS[i];
		}
		return DAYS[day % 7];
	}
}
