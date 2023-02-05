package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1009 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < t; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				int answer = 1;
				
				for(int j = 1; j <= b; j++) {
					answer = answer * a % 10;
				}
				
				if(answer == 0) sb.append(10).append("\n");
				else sb.append(answer).append("\n");
			}
			
			System.out.print(sb);
		}
	}
}
