import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1138 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> person = new ArrayList<>();

        // 사람 수 입력
        int N = Integer.parseInt(br.readLine());

        int[] left = new int[N]; // 좌측 키 큰 사람 수 담을 배열

        // 좌측 키 큰 사람 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            left[i] = Integer.parseInt(st.nextToken());
        }

        // 키가 큰 사람부터 Arraylist 대입 ( ex) 4 3 2 1 )
        for(int i = N; i > 0; i--) {
            person.add(left[i - 1], i);
        }

        for(int i = 0; i < N; i++) {
            sb.append(person.get(i)).append(" ");
        }

        System.out.println(sb);

    }
}
