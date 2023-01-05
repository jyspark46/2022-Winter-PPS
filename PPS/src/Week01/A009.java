package Week01;
class A009 {
    public boolean solution(String s) {
        
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
            
            char[] ch = s.toCharArray();
        
            for(char c : ch) {
                
                if(!Character.isDigit(c)) {
                    answer = false;
                    break;
                }
    
            }
        }
        
        else
            answer = false;
        
        return answer;
    }
}