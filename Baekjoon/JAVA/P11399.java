import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] time = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);

        int prev = 0; // 누적 대기 시간
        int sum = 0; // 대기 시간 합

        for(int i = 0; i < N; i++) {
            sum += prev + time[i];

            prev += time[i];
        }

        System.out.println(sum);

    }
}
