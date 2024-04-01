import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P18110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        int out = (int)Math.round(n * 0.15); // 절사 평균

        double sum = 0;

        for(int i = out; i < n - out; i++) {
            sum += num[i];
        }

        int result = (int)Math.round(sum / (n - out * 2));

        System.out.println(result);

    }

}
