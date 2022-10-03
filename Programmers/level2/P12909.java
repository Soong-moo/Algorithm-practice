package level2;

public class P12909 {

	class Solution {
		boolean solution(String s) {

			int left = 0;
			int right = 0;

			for (int i = 0; i < s.length(); i++) {
				char cnt = s.charAt(i);

				if (i == s.length() - 1 && cnt == '(')
					return false;

				if (cnt == '(')
					left++;
				else
					right++;

				if (left < right)
					return false;
			}

			if (left != right)
				return false;

			return true;
		}
	}

}