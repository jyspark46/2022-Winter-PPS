package Week01;
class A040 {
    public boolean halvesAreAlike(String s) {

        int left = 0, right = 0, middle = s.length() / 2;
        
        for(int i = 0; i < s.length(); i++) {
            
            Character c = s.charAt(i);
            
            if(isVowels(c)) {

                if(i >= middle)
                    right++;

                else
                    left++;
            }
        }
        
        return left == right;
    }
    
    private boolean isVowels(Character c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        
    }
}