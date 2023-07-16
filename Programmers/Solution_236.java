// 문제 : 둘만의 암호

class Solution_236 {

    private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public String solution(String originStr, String skip, int index) {
        String encStr = "";
        String availAlphabet = ALPHABET.replaceAll("[" + skip + "]", "");

        for (int i = 0; i < originStr.length(); i++) {
            int idx = availAlphabet.indexOf(Character.toString(originStr.charAt(i))) + index;
            encStr += Character.toString(availAlphabet.charAt(idx % availAlphabet.length()));
        }

        return encStr;

    }
}