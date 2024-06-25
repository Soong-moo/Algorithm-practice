import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2156 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] glass = new int[n];

        for(int i = 0; i < n; i++) {
            glass[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n];

        dp[0] = glass[0];

        for(int i = 1; i < n; i++) {
            if(i == 1) {
                dp[1] = glass[0] + glass[1];
                continue;
            }
            if(i == 2) {
                dp[2] = Math.max(dp[1], Math.max(glass[0] + glass[2], glass[1] + glass[2]));
                continue;
            }
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + glass[i], dp[i - 3] + glass[i] + glass[i - 1]));
        }

        System.out.println(dp[n - 1]);

    }
}
