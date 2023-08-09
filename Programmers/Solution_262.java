// 문제 : 5명씩

class Solution_262 {

    public String[] solution(String[] names) {

        int idx = 0;
        int len = names.length;
        String[] result = new String[(len - 1) / 5 + 1];

        for (int i = 0; i < len; i += 5) {
            result[idx] = names[i];
            idx++;
        }

        return result;
    }

}