package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1145 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int[] arr = new int[5];
			int i = 0; // array index
			int num = 1; // compare number
			int cnt = 0;
			
			while(st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());
				i++;
			}

			i = 0;
			
			while(cnt < 3) {
				cnt = 0;
				
				for(int j = 0; j < 5; j++) {
					if(num % arr[j] == 0) cnt++;
				}
			
				num++;	
			}
			System.out.println(--num);
		}
	}
}
