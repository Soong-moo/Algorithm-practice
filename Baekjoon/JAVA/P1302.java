import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1302 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> book = new HashMap<>();

        int N = Integer.parseInt(br.readLine()); // 팔린 책 수

        for(int i = 0; i < N; i++) {
            String name = br.readLine();
            book.put(name, book.getOrDefault(name, 0) + 1);
        }

        List<Integer> valueList = new ArrayList<>(book.values());
        List<String> keyList = new ArrayList<>(book.keySet());

        Collections.sort(valueList, Collections.reverseOrder());
        Collections.sort(keyList);

        for(String key : keyList) {
            if(book.get(key).equals(valueList.get(0))) {
                System.out.println(key);
                break;
            }
        }

    }

}
