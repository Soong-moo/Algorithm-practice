package baekjoon_intelliJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9506 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            sb.setLength(0);
            sb.append(n + " = 1");

            sum = 1;

            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }

            if(n == sum) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }

        }

    }

}
