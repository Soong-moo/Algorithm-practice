import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[41];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i < 41; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            if(N == 0) {
                System.out.println(1 + " " + 0);
                continue;
            }
            System.out.println(dp[N - 1] + " " + dp[N]);
        }

    }

}
