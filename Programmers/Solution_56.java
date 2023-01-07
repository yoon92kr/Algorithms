// 문제 : 크레인 인형뽑기 게임
// 결과 : 성공
// Score : 100
public class Solution_56 {

	public int[] stack = new int[1000];
	public int bomb = 0;
	public int index = 1;

	public int solution(int[][] board, int[] moves) {
		gameStart(board, moves, board.length, moves.length);
		return bomb;
	}

	void gameStart(int[][] board, int[] moves, int bLen, int mLen) {
		for (int i = 0; i < mLen; i++) {
			for (int j = 0; j < bLen; j++) {
				if (board[j][moves[i] - 1] != 0) {
					check(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
	}

	void check(int now) {
		if (now == get()) {
			pop();
			bomb += 2;
		} else {
			push(now);
		}
	}

	void push(int param) {
		stack[index] = param;
		index++;
	}

	int get() {
		return stack[index - 1];
	}

	void pop() {
		index--;
	}

}