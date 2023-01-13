package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9020 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean[] prime = new boolean[10001];

		prime[0] = prime[1] = true;

		for (int i = 2; i < Math.sqrt(prime.length); i++) { // 소수 판별
			if (prime[i]) continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}

		}

		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			int first = n / 2;
			int second = n / 2;

			while(true) {
				if (!prime[first] && !prime[second]) {
					sb.append(first).append(" ").append(second).append("\n");
					break;
				} else {
					first--;
					second++;
				}
			}
		}

		System.out.print(sb);
	}
}
