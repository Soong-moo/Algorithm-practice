package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1072_2 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			long x = Long.parseLong(st.nextToken()); // 게임 횟수
			long y = Long.parseLong(st.nextToken()); // 이긴 게임
						
			long avg = y * 100 / x; // 승률
			
			if(avg >= 99) {
				System.out.println(-1);
			} else {
				long a = x * avg + x - 100 * y;
				long b = 99 - avg;
				
				if(a % b == 0) {
					System.out.println(a % b);
				} else {
					System.out.println(a % b + 1);
				}
			}
	
		}
	}
	
}