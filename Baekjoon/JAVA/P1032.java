package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1032 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int n = Integer.parseInt(br.readLine());
			
			String[] arr = new String[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = br.readLine();
			}
			
			for(int i = 0; i < arr[0].length(); i++) {
				char c = arr[0].charAt(i);
				boolean check = true;
				
				for(int j = 1; j < n; j++) {
					if(c != arr[j].charAt(i)) {
						check = false;
					}
				}
				
				if(check) sb.append(c);
				else sb.append("?");
			}
			
			System.out.println(sb.toString());
		}
	}
}
