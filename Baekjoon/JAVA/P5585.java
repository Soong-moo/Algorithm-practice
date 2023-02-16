package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5585 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] money = {500, 100, 50, 10, 5, 1};
			
			int change = 1000 - Integer.parseInt(br.readLine());
			int i = 0; // index
			int cnt = 0; // 개수
			
			while(change != 0) {
				if(change < money[i]) {
					i++;
					continue;
				}
				
				change -= money[i];
				cnt++;
			}
			
			System.out.println(cnt);
			
		}
	}
}
