import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1427 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        char[] arr = num.toCharArray();

        Arrays.sort(arr);

        for(int i = num.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
