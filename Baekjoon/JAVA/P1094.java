package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1094 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(Integer.bitCount(Integer.parseInt(br.readLine())));
		
		}
	}
}
