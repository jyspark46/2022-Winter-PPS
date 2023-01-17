package Week02;
import java.util.*;

class A005 {
    public int solution(String skill, String[] skill_trees) {
        
        int answer = 0;
        
        StringBuilder realSkills;
        ArrayList<String> finalSkills = new ArrayList<String>();

        boolean flag[] = new boolean[127];
        for(char c : skill.toCharArray())
            flag[c] = true;

        for(int i = 0; i < skill_trees.length; i++) {
        	
        	realSkills = new StringBuilder();
        	
        	for(int j = 0; j < skill_trees[i].length(); j++) {
        		
        		char c = skill_trees[i].charAt(j);
        		
                if(flag[c] && realSkills.indexOf(String.valueOf(c)) == -1) {
                    realSkills.append(c);
                }
        	}
        	
        	finalSkills.add(realSkills.toString());            
        }
        
        for(int k = 0; k < finalSkills.size(); k++) {
        	
        	String str = skill.substring(0, finalSkills.get(k).length());
        	
        	if(str.equals(finalSkills.get(k)) || finalSkills.get(k).equals(""))
        		answer++;
        }
        
        return answer;
    }
}