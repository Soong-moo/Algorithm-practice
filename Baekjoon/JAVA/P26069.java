import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P26069 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<String> dance = new HashSet<>();

        int N = Integer.parseInt(br.readLine()); // 사람들이 만난 기록의 수

        dance.add("ChongChong"); // 총총이는 항상 춤을 춤

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String person1 = st.nextToken();
            String person2 = st.nextToken();

            if(dance.contains(person1) || dance.contains(person2)) {
                dance.add(person1);
                dance.add(person2);
            }
        }

        System.out.println(dance.size());

    }
}
