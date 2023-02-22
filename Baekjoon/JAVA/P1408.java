package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1408 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st1 = new StringTokenizer(br.readLine(), ":");
			
			int hour = Integer.parseInt(st1.nextToken());
			int minute = Integer.parseInt(st1.nextToken());
			int second = Integer.parseInt(st1.nextToken());
			
			int now = (hour * 3600) + (minute * 60) + second;
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), ":");
			
			hour = Integer.parseInt(st2.nextToken());
			minute = Integer.parseInt(st2.nextToken());
			second = Integer.parseInt(st2.nextToken());
			
			int start = (hour * 3600) + (minute * 60) + second;
			
			int time = 0;
			
			if(start > now) {
				time = start - now;
			} else {
				time = (24 * 3600) - (now - start);
			}
			
			System.out.format("%02d:%02d:%02d", (time / 3600), ((time / 60) % 60), (time % 60));
		}
	}
	
}
