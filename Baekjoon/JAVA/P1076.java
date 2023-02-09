package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P1076 {
	
	public class Main {
		
		public static void main(String[] args) throws Exception {
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			HashMap<String, String> hs = new HashMap<>();
			
			hs.put("black", "0");
			hs.put("brown", "1");
			hs.put("red", "2");
			hs.put("orange", "3");
			hs.put("yellow", "4");
			hs.put("green", "5");
			hs.put("blue", "6");
			hs.put("violet", "7");
			hs.put("grey", "8");
			hs.put("white", "9");
			
			String c1 = br.readLine();
			String c2 = br.readLine();
			String c3 = br.readLine();
			
			long answer = Long.parseLong(hs.get(c1) + hs.get(c2));
			
			answer *= Math.pow(10, Long.parseLong(hs.get(c3)));
			
			System.out.println(answer);
			
		}
	}
}
