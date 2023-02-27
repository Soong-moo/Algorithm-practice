package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1173 {

	public class Main {

		public static void main(String[] args) throws Exception {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken()); // 운동 시간
			int m = Integer.parseInt(st.nextToken()); // 초기 맥박
			int M = Integer.parseInt(st.nextToken()); // 최대 맥박
			int T = Integer.parseInt(st.nextToken()); // 증가 맥박
			int R = Integer.parseInt(st.nextToken()); // 감소 맥박

			int m_begin = m; // 초기 맥박 저장
			int exercise = 0; // 운동
			int rest = 0; // 휴식

			while(exercise != N) {

				if(m + T <= M) {
					m += T;
					exercise++;
				} else {
					m -= R;
					rest++;
					
					if(m < m_begin) m = m_begin;
				}

				// 운동 후 맥박이 최대 맥박보다 크고, 맥박이 초기 맥박인 경우 운동 불가
				if((m + T > M) && (m == m_begin)) break;
			}

			if(exercise != N) System.out.println(-1);
			else System.out.println(exercise + rest);
		}
	}

}
