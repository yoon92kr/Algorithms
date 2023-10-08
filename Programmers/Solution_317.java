// 문제 : 그림 확대

class Solution_317 {

    public String[] solution(String[] picture, int k) {

        int height = picture.length;
        int width = picture[0].length();
        String[] result = new String[height * k];

        for (int i = 0; i < height; i++) {
            // 확대한 가로줄을 생성한다
            String enlargedWidth = "";
            for (int j = 0; j < width; j++) {
                enlargedWidth += String.valueOf(picture[i].charAt(j)).repeat(k);
            }

            // 세로줄을 확대된 가로줄로 확대한만큼 채운다
            for (int m = i * k; m < (i * k) + k; m++) {
                result[m] = enlargedWidth;
            }
        }

        return result;

    }

}
