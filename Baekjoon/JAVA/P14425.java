import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P14425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> comp = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;

        // N개 문자열 입력
        for(int i = 0; i < N; i++) {
            comp.put(br.readLine(), 1);
        }

        // M개 문자열 입력과 동시에 Map에 들어있는지 확인 후 포함될 경우 + 1
        for(int i = 0; i < M; i++) {
            if(comp.containsKey(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);

    }
}
