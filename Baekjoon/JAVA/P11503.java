import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11503 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 수열의 크기

        int[] sequence = new int[N + 1]; // 수열 저장할 배열
        int[] dp = new int[N + 1]; // 수열 길이 판별 dp

        st = new StringTokenizer(br.readLine()); // 수열을 이루는 수

        for(int i = 1; i <= N; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1; // dp 최소 길이로 초기화
        }

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j < i; j++) {
                if(sequence[j] < sequence[i] && dp[i] < dp[j] + 1) {
                    dp[i] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }

        int max = 0; // 최댓값 찾기

        for(int i = 1; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
