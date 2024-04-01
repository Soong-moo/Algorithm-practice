import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[N + 1];
        int[] dp = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = num[1];
        int max = dp[1];

        for(int i = 2; i <= N; i++) {
            dp[i] = Math.max(dp[i - 1] + num[i], num[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
