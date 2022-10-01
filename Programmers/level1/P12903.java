package level1;

public class P12903 {

	class Solution {
		public String solution(String s) {
			String[] answer = s.split("");
			StringBuilder sb = new StringBuilder();

			if (s.length() % 2 == 1) {
				sb.append(answer[s.length() / 2]);
			} else {
				sb.append(answer[s.length() / 2 - 1]);
				sb.append(answer[s.length() / 2]);
			}

			return sb.toString();
		}
	}

}
