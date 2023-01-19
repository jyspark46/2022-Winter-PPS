package Week04;

import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
        
        HashSet<String> answer = new HashSet<>();

        for(String str : words) {
            
            StringBuilder strBld = new StringBuilder("");
            
            for(int i = 0; i < str.length(); i++)
                strBld.append(morse[str.charAt(i) - 'a']);

            answer.add(strBld.toString());
        }

        return answer.size();      
    }
}