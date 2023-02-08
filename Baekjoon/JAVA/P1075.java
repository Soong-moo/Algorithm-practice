package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1075 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			int f = Integer.parseInt(br.readLine());
			
			int temp = (n / 100) * 100;
			
			while(true) {
				if(temp % f == 0) {
					int num = temp % 100;
					if(num < 10) System.out.println("0" + num);
					else System.out.println(num);
					break;
				}
				temp++;
			}
			
		}
	}
}
