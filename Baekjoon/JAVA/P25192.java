import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P25192 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hs = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        int count = 0; // 곰곰티콘 사용한 인원 수

        for (int i = 0; i < N; i++) {

            String str = br.readLine();

            if (str.equals("ENTER")) {
                count += hs.size();
                hs = new HashSet<>(); // 새로운 사람 수 다시 세기 위함
            } else {
                hs.add(str);
            }

        }

        count += hs.size(); // 입력이 끝난 후 마지막으로 더해줌

        System.out.println(count);
    }
}