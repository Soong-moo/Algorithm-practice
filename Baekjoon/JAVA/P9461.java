//https://st-lab.tistory.com/127

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9461 {

    static StringBuilder sb = new StringBuilder();
    public static long[] array = new long[101];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        array[0] = 0L;
        array[1] = 1L;
        array[2] = 1L;
        array[3] = 1L;

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(padovan(N)).append("\n");
        }

        System.out.println(sb);
    }

    public static long padovan(int N) {

        if(array[N] == 0L) {
            array[N] = padovan(N - 2) + padovan(N - 3);
        }

        return array[N];
    }
}
