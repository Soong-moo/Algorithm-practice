import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P24416 {

    static int fibCount = 0;
    static int fibonacciCount = 0;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n];

        fib(n);
        fibonacci(n);

        System.out.print(fibCount + " ");
        System.out.print(fibonacciCount);

    }

    public static int fib(int n) {
        if(n == 1 || n == 2) {
            fibCount++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n; i++) {
            fibonacciCount++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }
}
