import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] sum = new long[N + 1]; // 구간 합 저장

        st = new StringTokenizer(br.readLine()); // N개의 수

        for(int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());

            int preIndex = Integer.parseInt(st.nextToken());
            int postIndex = Integer.parseInt(st.nextToken());

            sb.append(sum[postIndex] - sum[preIndex - 1]).append("\n");
        }

        System.out.println(sb);

    }
}
