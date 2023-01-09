package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2581 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int answer = 0;
		int min = 0;
		int tmp = 0;

		if (n > m) {
			tmp = n;
			n = m;
			m = tmp;
		}

		for (int i = m; i >= n; i--) {
			for (int j = 2; j <= i; j++) {
				if (j + 1 == i || i == 2) {
					min = i;
					answer += i;
				} else if (i % j == 0) {
					break;
				}
			}
		}

		if (answer == 0) {
			answer -= 1;
			System.out.println(answer);
		} else {
			System.out.println(answer);
			System.out.println(min);
		}
	}
}