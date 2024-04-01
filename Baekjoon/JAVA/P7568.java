import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 전체 사람 수

        int[][] person = new int[N][2]; // 몸무게, 키를 사람 수만큼

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            person[i][0] = Integer.parseInt(st.nextToken());
            person[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb);

    }
}
