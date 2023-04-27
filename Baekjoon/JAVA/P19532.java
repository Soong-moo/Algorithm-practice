import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19532 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a, b, c, d, e, f;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        int x = 0, y = 0;

        for(int i = -999; i < 1000; i++) {
            for(int j = -999; j < 1000; j++) {
                if((a*i + b*j == c) && (d*i + e*j == f)) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        System.out.println(x + " " + y);

    }
}
