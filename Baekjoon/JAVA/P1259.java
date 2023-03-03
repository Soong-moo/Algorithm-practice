package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1259 {
	
	public class Main {
		
		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<String> al = new ArrayList<>();
			ArrayList<String> reply = new ArrayList<>();
			
			while(true) {
				String num = br.readLine();
				if(!num.equals("0")) al.add(num);
				else break;
			}
			
			for(int i = 0; i < al.size(); i++) {
				for(int j = 0; j <= al.get(i).length() / 2; j++) {
					if(al.get(i).charAt(j) != al.get(i).charAt(al.get(i).length() - j - 1)) {
						reply.add("no");
						break;
					}
				}
				if(i == 0 && reply.isEmpty()) reply.add("yes");
				else if(i > 0 && reply.size() <= i) reply.add("yes");
			}
			
			for(int i = 0; i < reply.size(); i++) {
				System.out.println(reply.get(i));
			}
			
		}
	}

}
