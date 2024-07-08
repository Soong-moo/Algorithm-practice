import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10610 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String num = br.readLine();

        int sum = 0; // 3의 배수는 모든 수의 합이 3의 배수

        for(int i = 0; i < num.length(); i++) {
            sum += num.charAt(i);
        }

        if(!num.contains("0") || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        char[] array = num.toCharArray();

        Arrays.sort(array);

        for(int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        System.out.println(sb.toString());
    }
}
