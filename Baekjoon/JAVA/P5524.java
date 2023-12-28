import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5524 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수 개수
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            System.out.println(str.toLowerCase());
        }

    }
}
