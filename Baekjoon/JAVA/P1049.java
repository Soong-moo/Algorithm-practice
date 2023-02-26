package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1049 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken()); // 끊어진 줄 개수
			int m = Integer.parseInt(st.nextToken()); // 브랜드 수
			
			int[] pack = new int[m]; // 묶음
			int[] single = new int[m]; // 낱개
			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				pack[i] = Integer.parseInt(st.nextToken());
				single[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(pack);
			Arrays.sort(single);
			
			int price = 0;
			
			price = Math.min(((n / 6) + 1) * pack[0], n * single[0]);
			price = Math.min(price, (n / 6) * pack[0] + (n % 6) * single[0]);
			
			System.out.println(price);
		}
	}
}
