package level1;

public class P161990 {

    class Solution {
        public int[] solution(String[] wallpaper) {
            int[] answer = new int[4];
            int y1, x1, y2, x2; //y1, x1 = 시작점, y2, x2 = 종료점

            y1 = x1 = Integer.MAX_VALUE;
            y2 = x2 = Integer.MIN_VALUE;

            for(int i = 0; i < wallpaper.length; i++) {
                for(int j = 0; j < wallpaper[i].length(); j++) {
                    if(wallpaper[i].charAt(j) == '#') {
                        y1 = Math.min(y1, i);
                        x1 = Math.min(x1, j);
                        y2 = Math.max(y2, i);
                        x2 = Math.max(x2, j);
                    }
                }
            }

            answer[0] = y1; answer[1] = x1; answer[2] = y2 + 1; answer[3] = x2 + 1;

            return answer;
        }
    }
}
