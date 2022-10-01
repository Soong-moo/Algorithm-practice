package level1;

public class P12943 {

	class Solution {

		public int solution(int num) {
			int cnt = 0;
			long n = num;

			if (n == 1)
				return 0;

			while (true) {
				if (n % 2 == 0) {
					n /= 2;
				} else if (n % 2 != 0) {
					n = (n * 3) + 1;
				}

				cnt++;

				if (n == 1)
					break;
				if (cnt == 500)
					return -1;
			}

			return cnt;
		}
	}

}
