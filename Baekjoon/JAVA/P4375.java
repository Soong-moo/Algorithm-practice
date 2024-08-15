import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P4375 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            long num = 1;

            for(int i = 1; ; i++) {
                if(num % n != 0) {
                    num = num * 10 + 1;
                    num %= n; // 모듈러 연산?
                } else {
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
