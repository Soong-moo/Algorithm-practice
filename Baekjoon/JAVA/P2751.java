import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2751 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> al = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(al);

        for(int i = 0; i < n; i++) {
            sb.append(al.get(i)).append("\n");
        }

        System.out.println(sb.toString());

    }

}
