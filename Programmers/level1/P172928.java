package level1;

public class P172928 {

    class Solution {
        public int[] solution(String[] park, String[] routes) {
            int[] answer = new int[2];
            int[] location = {0,0};
            char[][] geopoint = new char[park.length][park[0].length()];

            for(int i = 0; i < park.length; i++) {
                for(int j = 0; j < park[i].length(); j++) {
                    geopoint[i][j] = park[i].charAt(j);
                    if(park[i].charAt(j) == 'S') {
                        location[0] = i;
                        location[1] = j;
                    }
                }
            }

            for(int i = 0; i < routes.length; i++) {

                int[] memory = {location[0], location[1]};
                String[] value = routes[i].split(" ");
                char direction = value[0].charAt(0);

                if(direction == 'E') {
                    for(int j = 0; j < Integer.parseInt(value[1]); j++) {
                        if(location[1] == park[0].length() - 1) {
                            location[1] = memory[1];
                            break;
                        }
                        location[1]++;
                        if(geopoint[location[0]][location[1]] == 'X') {
                            location[1] = memory[1];
                            break;
                        }
                    }
                    memory[1] = location[1];
                }
                else if(direction == 'W') {
                    for(int j = 0; j < Integer.parseInt(value[1]); j++) {
                        if(location[1] == 0) {
                            location[1] = memory[1];
                            break;
                        }
                        location[1]--;
                        if(geopoint[location[0]][location[1]] == 'X') {
                            location[1] = memory[1];
                            break;
                        }
                    }
                    memory[1] = location[1];
                }
                else if(direction == 'N') {
                    for(int j = 0; j < Integer.parseInt(value[1]); j++) {
                        if(location[0] == 0) {
                            location[0] = memory[0];
                            break;
                        }
                        location[0]--;
                        if(geopoint[location[0]][location[1]] == 'X') {
                            location[0] = memory[0];
                            break;
                        }
                    }
                    memory[0] = location[0];
                }
                else if(direction == 'S') {
                    for(int j = 0; j < Integer.parseInt(value[1]); j++) {
                        if(location[0] == park.length - 1) {
                            location[0] = memory[0];
                            break;
                        }
                        location[0]++;
                        if(geopoint[location[0]][location[1]] == 'X') {
                            location[0] = memory[0];
                            break;
                        }
                    }
                    memory[0] = location[0];
                }

            }

            answer[0] = location[0];
            answer[1] = location[1];
            return answer;
        }
    }
}