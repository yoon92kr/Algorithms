// 문제 : 키패드 누르기
// 결과 : 성공
// Score : 100
public class Solution_60 {
	public int leftIndex = 10;
	public int rightIndex = 12;

	public String solution(int[] numbers, String hand) {
		String result = "";
		for (int i = 0; i < numbers.length; i++) {
			if (i == 10) {
				System.out.println("hi");
			}
			result += isMiddleZone(numbers[i]) ? measure(numbers[i], hand) : setLR(numbers[i]);
		}
		return result;
	}

	String measure(int param, String hand) {
		param = param == 0 ? 11 : param;
		int leftDiff = changeLen(Math.abs(param - leftIndex));
		int rightDiff = changeLen(Math.abs(param - rightIndex));

		// 같은 번호를 눌렀을 경우 차이가 0이기 때문에 1순위로 리턴.
		if (leftDiff == 0) {
			return "L";
		} else if (rightDiff == 0) {
			return "R";
		}
		// 차이가 같을 경우 익숙한 손에 가산을 준다.
		if (leftDiff == rightDiff) {
			return hand.equals("left") ? setLeft(param) : setRight(param);
		}

		// 두 값이 다를경우 작은 값이 눌러야할 번호와 가깝다고 판단한다.
		return leftDiff < rightDiff ? setLeft(param) : setRight(param);
	}

	int changeLen(int param) {
		int len = 0;
		// 누를 번호와 현재의 Index의 차가 3 미만이라면 거리와 같다고 판단한다.
		if (param < 3) {
			return param;
		}

		// 3의 경우 거리 1로 판단하며, 4의 경우 거리 2로 판단한다.
		while (param > 0) {
			if (param % 3 == 0) {
				len += param / 3;
				break;
			}

			if (param >= 4) {
				len += 2;
				param -= 4;
			} else if (param >= 3) {
				len++;
				param -= 3;
			} else {
				len += param;
				break;
			}
		}
		return len;
	}

	String setLR(int param) {
		return isLeftZone(param) ? setLeft(param) : setRight(param);
	}

	boolean isLeftZone(int param) {
		return param == 1 || param == 4 || param == 7 ? true : false;
	}

	boolean isMiddleZone(int param) {
		return param == 2 || param == 5 || param == 8 || param == 0 ? true : false;
	}

	String setLeft(int param) {
		leftIndex = param;
		return "L";
	}

	String setRight(int param) {
		rightIndex = param;
		return "R";
	}

}