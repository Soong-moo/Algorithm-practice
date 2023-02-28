// binary search
package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1072 {

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
				long left = 0;
				long right = x;
				
				while(left <= right) {
					long mid = (left + right) / 2;
					
					if(avg < (y + mid) * 100 / (x + mid)) {
						right = mid - 1;
					} else {
						left = mid + 1;
					}
				}
				System.out.println(left);
			}
	
		}
	}
	
}
