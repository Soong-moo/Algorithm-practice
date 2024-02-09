import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2579 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 계단 수

        // N + 3는 계단이 1개인 경우 N + 1 또는 N + 2로 설정 시 index 3인 배열에서 ArrayIndexOutofBounds Exception 발생함
        int[] stair = new int[N + 3];
        int[] dp = new int[N + 3];

        for(int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];
        dp[3] = Math.max(stair[1], stair[2]) + stair[3];

        // 연속된 3개 계단은 밟을 수 없음
        // N - 3, N - 1, N을 밟는 경우, N - 2, N을 밟는 경우 중 더 큰 수
        for(int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i - 3] + stair[i - 1], dp[i - 2]) + stair[i];
        }

        System.out.println(dp[N]);
    }
}
