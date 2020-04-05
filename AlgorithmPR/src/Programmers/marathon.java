package Programmers;

import java.util.Arrays;

public class marathon {
		public static void main(String[] args) {
			String[] participant = {"leo", "ziki", "eden"};
			String[] completion = {"eden", "ziki"};
			String answer="";
			
			Arrays.sort(participant);
			Arrays.sort(completion);
			
			for(int i =0 ; i<participant.length;i++) {
				if(i == participant.length-1) {
					answer =participant[i];
					System.out.print(answer);break;
				}
				else if(!participant[i].equals(completion[i])) {
					answer = participant[i];
					System.out.print(answer);break;
				}
			}
			
		}
}
/*
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}

*/