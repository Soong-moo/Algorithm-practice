import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P7785 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine()); // 출입 기록 수

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken(); // 이름
            String result = st.nextToken(); // 출,퇴근 여부

            if(result.equals("enter")) {
                set.add(name);
            } else if(set.contains(name) && result.equals("leave")) {
                set.remove(name);
            }

        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
