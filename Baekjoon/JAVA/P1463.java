//https://velog.io/@kimmjieun/%EB%B0%B1%EC%A4%80-1463%EB%B2%88-1%EB%A1%9C-%EB%A7%8C%EB%93%A4%EA%B8%B0-Java-%EC%9E%90%EB%B0%94

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1463 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];

        dp[1] = 0;

        for(int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1; // 1을 빼는 경우
            if(i % 2 == 0) { // 2로 나눈 경우
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1을 뺀 경우와 2로 나눈 경우 중 최소 탐색
            }
            if(i % 3 == 0) { // 3으로 나눈 경우
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]);
    }

}
