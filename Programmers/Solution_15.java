import java.util.Arrays;

// 문제 : 최소직사각형
// 결과 : 성공
// Score : 100
public class Solution_15 {
	public int solution(int[][] sizes) {
		return walletSize(sizes, sizes.length);
	}

	private int walletSize(int[][] sizes, int len) {
		int w = 0;
		int h = 0;

		for (int i = 0; i < len; i++) {
			Arrays.sort(sizes[i]);
			w = sizes[i][0] > w ? sizes[i][0] : w;
			h = sizes[i][1] > h ? sizes[i][1] : h;
		}

		return w * h;
	}

}