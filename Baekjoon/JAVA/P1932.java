import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1932 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 삼각형 크기
        int n = Integer.parseInt(br.readLine());

        // 삼각형 숫자
        int[][] num = new int[n + 1][n + 1];
        // 삼각형 숫자 합
        int[][] sum = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j <= i; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                // 현재 숫자와 이전 층 숫자 합
                sum[i][j] = Math.max(sum[i - 1][j - 1], sum[i - 1][j]) + num[i][j];
            }
        }

        int res = 0;

        for(int i = 1; i <= n; i++) {
            res = Math.max(res, sum[n][i]);
        }

        System.out.println(res);
    }
}
