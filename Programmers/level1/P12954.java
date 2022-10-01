package level1;

public class P12954 {

	class Solution {
		public long[] solution(long x, int n) {
			long[] answer = new long[n];
			long y = x;
			for (int i = 0; i < n; i++) {
				answer[i] = x;
				x += y;
			}
			return answer;
		}
	}

}
