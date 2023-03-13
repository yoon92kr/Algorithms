// 문제 : 모스부호 (1)
// 결과 : 성공
// Score : 100
public class Solution_137 {

	public String solution(String param) {
		String result = "";

		for (String item : param.split(" ")) {
			switch (item) {
				case ".-":
					result += "a";
					break;
				case "-...":
					result += "b";
					break;
				case "-.-.":
					result += "c";
					break;
				case "-..":
					result += "d";
					break;
				case ".":
					result += "e";
					break;
				case "..-.":
					result += "f";
					break;
				case "--.":
					result += "g";
					break;
				case "....":
					result += "h";
					break;
				case "..":
					result += "i";
					break;
				case ".---":
					result += "j";
					break;
				case "-.-":
					result += "k";
					break;
				case ".-..":
					result += "l";
					break;
				case "--":
					result += "m";
					break;
				case "-.":
					result += "n";
					break;
				case "---":
					result += "o";
					break;
				case ".--.":
					result += "p";
					break;
				case "--.-":
					result += "q";
					break;
				case ".-.":
					result += "r";
					break;
				case "...":
					result += "s";
					break;
				case "-":
					result += "t";
					break;
				case "..-":
					result += "u";
					break;
				case "...-":
					result += "v";
					break;
				case ".--":
					result += "w";
					break;
				case "-..-":
					result += "x";
					break;
				case "-.--":
					result += "y";
					break;
				case "--..":
					result += "z";
					break;
			}
		}
		return result;
	}

}