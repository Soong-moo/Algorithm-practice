package level1;

public class P86051 {

	class Solution {
		public int solution(int[] numbers) {
			int answer = 45;
			int sum = 0;
			int[] n = numbers;
			for (int i = 0; i < n.length; i++) {
				sum += n[i];
			}
			return answer - sum;
		}
	}

}
