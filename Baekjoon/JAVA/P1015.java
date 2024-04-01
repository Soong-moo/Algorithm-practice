import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1015 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            A[i] = B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(B);

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(A[i] == B[j]) {
                    sb.append(j + " ");
                    B[j] = -1; // 같은 수가 들어왔을 때 앞에 있는 값으로 index 찾는 것 방지
                    break;
                }
            }
        }

        System.out.println(sb);

    }
}
