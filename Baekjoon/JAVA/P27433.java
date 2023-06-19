import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27433 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long factorial = 1;

        for(int i = Integer.parseInt(br.readLine()); i > 0; i--) {
            factorial *= i;
        }

        System.out.println(factorial);

    }
}
