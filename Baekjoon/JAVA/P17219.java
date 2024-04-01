import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P17219 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 저장된 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken()); // 비밀번호를 찾으려는 사이트 주소의 수

        Map<String, String> map = new HashMap<>(); // 주소와 비밀번호 저장

        String[] site = new String[M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            site[i] = br.readLine();
        }

        for(int i = 0; i < M; i++) {
            if(map.containsKey(site[i])) {
                sb.append(map.get(site[i])).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
