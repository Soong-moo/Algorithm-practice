import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12603 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 반복 횟수

        for(int i = 0; i < N; i++) {
            int C = Integer.parseInt(br.readLine()); // 보유 금액
            int P = Integer.parseInt(br.readLine()); // 아이템 개수

            int[] array = new int[P];

            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < P; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < P - 1; j++) {
                for(int k = j + 1; k < P; k++) {
                    if(array[j] + array[k] == C) {
                        sb.append("Case #" + (i + 1) + ": " + (j + 1) + " " + (k + 1)).append("\n");
                        break;
                    }
                }
            }

        }

        System.out.println(sb);

    }
}
