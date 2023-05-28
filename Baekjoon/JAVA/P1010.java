//https://sehyeok.tistory.com/118

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int answer;

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            answer = 1;

            for(int j = 0; j < n; j++) {
                answer = answer * (m - j) / (j + 1);
            }

            System.out.println(answer);
        }

    }
}
