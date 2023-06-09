import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10870 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(fibonacci(Integer.parseInt(br.readLine())));

    }

    public static int fibonacci(int n) {

        if(n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
