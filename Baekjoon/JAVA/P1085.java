package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1085 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			int x_min = Math.min(x, w - x);
			int y_min = Math.min(y, h - y);
			
			System.out.println(Math.min(x_min, y_min));
			
			
//			if(w - x < x || h - y < y) {
//				if(w - x > h - y) System.out.println(h - y);
//				else System.out.println(w - x);
//			} else {
//				if(x > y) System.out.println(y);
//				else System.out.println(x);
//			}
			
		}
	}
}
