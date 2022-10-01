package level1;

import java.util.ArrayList;

public class P12935 {

	class Solution {
		public int[] solution(int[] arr) {

			if (arr.length == 1) {
				int[] answer = { -1 };
				return answer;
			}
			int[] answer = arr;
			int min = Integer.MAX_VALUE;

			ArrayList<Integer> a = new ArrayList<Integer>();

			for (int i = 0; i < answer.length; i++) {
				a.add(answer[i]);
				if (min > answer[i])
					min = answer[i];
			}
			a.remove(a.indexOf(min));

			answer = new int[a.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = a.get(i);
			}

			return answer;
		}
	}

}
