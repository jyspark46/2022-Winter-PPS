package Week01;
class A006 {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;
        
        char[] ch = s.toCharArray();
        
            for(char c : ch) {
                
                if(c == 'p' || c == 'P')
                    pCount++;
                
                else if(c == 'y' || c == 'Y')
                    yCount++;
                
            }
        
        if(pCount == yCount)
            answer = true;
        
        else
            answer = false;
        
        return answer;
    }
}