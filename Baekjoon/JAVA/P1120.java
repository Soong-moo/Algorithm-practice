import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1120 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        int answer = a.length();

        for(int i = 0; i < b.length() - a.length() + 1; i++) {
            int cnt = 0;
            for(int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    cnt++;
                }
            }
            if(answer > cnt) {
                answer = cnt;
            }
        }

        System.out.println(answer);

    }
}
