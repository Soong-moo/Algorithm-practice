package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1110 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			
			int answer = n;
			int cnt = 0;
			
			
			while(true) {
				
				n = (n % 10 * 10) + ((n / 10 + n % 10) % 10);
				cnt++;
				
				if(answer == n) break;
			}
			
			System.out.println(cnt);
		}
	}
}
