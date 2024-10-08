import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P10867 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<Integer> hash = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            hash.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> list = new ArrayList<>(hash);

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
