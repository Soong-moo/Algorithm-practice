import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13241 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long answer = a * b / gcd(a, b);

        System.out.println(answer);
    }

    public static long gcd(long a, long b) {

        while(b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
