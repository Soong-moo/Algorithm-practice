package baekjoon_intelliJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1436 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 입력 수

        int num = 666;
        int cnt = 1;

        while(cnt != n) {
            num++;
            if(String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}
