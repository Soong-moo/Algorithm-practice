package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2588 {

	public class Main {

		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			System.out.println(((y % 100) % 10) * x);
			System.out.println(((y % 100) / 10) * x);
			System.out.println((y / 100) * x);
			System.out.println(x * y);

		}
	}
}
