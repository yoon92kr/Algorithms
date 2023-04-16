// 문제 : 숫자 카드 나누기
// 결과 : 성공
// Score : 100
public class Solution_178 {

	public int solution(int[] arrayA, int[] arrayB) {
		int gdcA = getGDC(arrayA, arrayA.length);
		int gdcB = getGDC(arrayB, arrayB.length);
		return shareCard(arrayA, arrayB, gdcA, gdcB);
	}

	int getGDC(int[] param, int len) {
		int gdc = len == 1 ? param[0] : gdc(param[0], param[1]);

		for (int i = 2; i < len; i++) {
			gdc = gdc(gdc, param[i]);
		}

		return gdc == 1 ? 0 : gdc;
	}

	int gdc(int num1, int num2) {
		return num2 == 0 ? num1 : gdc(num2, num1 % num2);
	}

	int shareCard(int[] arrayA, int[] arrayB, int gdcA, int gdcB) {

		if (gdcB != 0) {
			for (int i = 0; i < arrayA.length; i++) {
				if (arrayA[i] % gdcB == 0) {
					gdcB = 0;
					break;
				}
			}
		}

		if (gdcA != 0) {
			for (int i = 0; i < arrayB.length; i++) {
				if (arrayB[i] % gdcA == 0) {
					gdcA = 0;
					break;
				}
			}
		}

		return gdcA > gdcB ? gdcA : gdcB;
	}

}