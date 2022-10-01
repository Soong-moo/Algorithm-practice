package level1;

import java.util.Arrays;

public class P12917 {

	class Solution {
		public String solution(String s) {
			String[] answer = s.split("");
			
			Arrays.sort(answer);
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < answer.length; i++) {
				sb.append(answer[i]);
			}
			sb.reverse();

			return sb.toString();
		}
	}

}
