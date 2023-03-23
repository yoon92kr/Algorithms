// 문제 : 캐릭터의 좌표
// 결과 : 성공
// Score : 100

class Solution {

	public int[] solution(String[] param, int[] size) {
		
		int maxWidth = (size[0] - 1) / 2;
		int maxHeight = (size[1] - 1) / 2;
		int[] position = { 0, 0 };

		for (int i = 0; i < param.length; i++) {

			if (param[i].contains("t")) { // Left, Right
				position[0] += param[i].equals("left") ? -1 : 1;
			} else { // Up, Down
				position[1] += param[i].equals("down") ? -1 : 1;
			}

			if (Math.abs(position[0]) > maxWidth)
				position[0] += position[0] > 0 ? -1 : 1;
			if (Math.abs(position[1]) > maxHeight)
				position[1] += position[1] > 0 ? -1 : 1;

		}

		return position;
	}

}
