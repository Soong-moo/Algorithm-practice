package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1026 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			
			int n = Integer.parseInt(br.readLine());
			
			int[] A = new int[n];
			int[] B = new int[n];
			
			int answer = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < n; i++) B[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			for(int i = 0; i < n; i++) answer += A[i] * B[n - i - 1];
			
			System.out.println(answer);
			
		}
	}
	
}
