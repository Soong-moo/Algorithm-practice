package level1;

public class P12948 {

	class Solution {
		public String solution(String phone_number) {
			String answer = phone_number;
			String[] a = answer.split("");
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < a.length; i++) {
				if (i < a.length - 4) {
					a[i] = "*";
				}
				sb.append(a[i]);
			}
			answer = sb.toString();
			return answer;
		}
	}

}
