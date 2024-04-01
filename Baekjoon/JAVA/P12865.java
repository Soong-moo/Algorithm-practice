import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12865 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 버틸 수 있는 무게

        int[][] dp = new int[N + 1][K + 1];
        int[] W = new int[N + 1]; // 무게 저장
        int[] V = new int[N + 1]; // 가치 저장

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= K; j++) {
                dp[i][j] = dp[i - 1][j]; // 이전 무게 저장
                if(j - W[i] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - W[i]] + V[i]);
                }
            }
        }

        System.out.println(dp[N][K]);

    }
}
