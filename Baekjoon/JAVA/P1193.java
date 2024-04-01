import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int crossLine = 0; // 대각선 수
        int sum = 0; // 분수 총 개수

        while(sum < X) {
            crossLine++; // 대각선 수 증가
            sum += crossLine; // 대각선 수 만큼 분수 개수 증가
        }

        if(crossLine % 2 == 0) { // 대각선 수 짝수
            System.out.println(crossLine - (sum - X) + "/" + (crossLine + (((sum - crossLine) - X) + 1)));
        } else {
            System.out.println(crossLine + (((sum - crossLine) - X) + 1) + "/" + (crossLine - (sum - X)));
        }

    }
}