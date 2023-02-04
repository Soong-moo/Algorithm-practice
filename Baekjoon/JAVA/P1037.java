package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P1037 {

	public class Main {
		
		static int max = Integer.MIN_VALUE;
		static int min = Integer.MAX_VALUE;
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			while(n > 0) {
				int a = Integer.parseInt(st.nextToken());
				
				if(a > max)  max = a;
				else if(a < min) min = a;
				n--;
			}
			
			System.out.println(max * min);
		}
	}
}
