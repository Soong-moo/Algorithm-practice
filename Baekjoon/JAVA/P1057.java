package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1057 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int round = Integer.parseInt(st.nextToken()); // 참가자 수
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
			while(a != b) {
				a = a / 2 + a % 2;
				b = b / 2 + b % 2;
				cnt++;
			}
			
			System.out.println(cnt);
			
		}
	}
}
