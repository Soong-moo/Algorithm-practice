import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P5800 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int K = Integer.parseInt(br.readLine()); // 반의 수

        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // 해당 반의 학생 수

            int max = Integer.MIN_VALUE;

            int[] score = new int[N];

            for(int j = 0; j < N; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score);

            for(int j = 0; j < score.length - 1; j++) {
                max = Math.max(max, score[j + 1] - score[j]);
            }

            sb.append("Class " + (i + 1)).append("\n");
            sb.append("Max " + score[N - 1]).append(", Min " + score[0]);
            sb.append(", Largest gap " + max).append("\n");
        }

        System.out.println(sb);

    }
}
