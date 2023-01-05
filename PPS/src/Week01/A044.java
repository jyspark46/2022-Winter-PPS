package Week01;
class A044 {
    public boolean checkRecord(String s) {

        int countA = 0;
        int countL = 0;

        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            if(c == 'A')
                countA++;

            if(c == 'L')
                countL++;
            
            else
                countL = 0;
            
            if(countA > 1 || countL > 2)
                return false;
        }

        return true;
        
    }
}