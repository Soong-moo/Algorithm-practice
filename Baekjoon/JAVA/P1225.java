package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1225 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String x = st.nextToken();
			String y = st.nextToken();
			
			long answer = 0;
			
			for(int i = 0; i < x.length(); i++) {
				for(int j = 0; j < y.length(); j++) {
					answer += (x.charAt(i) - '0') * (y.charAt(j)- '0');
				}
			}
			
			System.out.println(answer);
			
		}
	}
}
