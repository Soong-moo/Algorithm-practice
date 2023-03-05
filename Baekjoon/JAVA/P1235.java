//https://january-diary.tistory.com/entry/BOJ-1235-%ED%95%99%EC%83%9D%EB%B2%88%ED%98%B8-JAVA
package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P1235 {

	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			HashSet<String> hs = new HashSet<>();
			
			int N = Integer.parseInt(br.readLine());
			String[] student = new String[N];
			
			for(int i = 0; i < N; i++) {
				student[i] = br.readLine();
			}
			
			int len = student[0].length(); // 학생 번호 길이
			
			for(int j = 1; j <= len; j++) {
				for(int k = 0; k < N; k++) {
					hs.add(student[k].substring(len - j));
				}
				
				if(hs.size() == N) { // hashset size가 N이랑 같으면 번호가 겹치지 않음
					System.out.println(j);
					return;
				}
				
				hs.clear();
			}
		}
	}
}
