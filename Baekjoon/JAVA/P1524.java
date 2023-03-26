package baekjoon_intelliJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1524 {
        public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());

            for(int i = 0; i < T; i++) {

                String L = br.readLine(); // test case 구분
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                int Smax = 0;
                int Bmax = 0;

                st = new StringTokenizer(br.readLine()); // 세준 병사
                for(int j = 0; j < N; j++) {
                    int S = Integer.parseInt(st.nextToken());

                    if(Smax < S) Smax = S;
                }

                st = new StringTokenizer(br.readLine()); // 세비 병사
                for(int j = 0; j < M; j++) {
                    int B = Integer.parseInt(st.nextToken());

                    if (Bmax < B) Bmax = B;
                }

                if(Smax > Bmax) System.out.println("S");
                else if (Bmax > Smax) System.out.println("B");
                else System.out.println("S");
            }
        }
    }

