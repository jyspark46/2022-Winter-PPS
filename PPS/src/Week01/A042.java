package Week01;
class A042 {
    public boolean backspaceCompare(String s, String t) {

        int count = 0;
        String str1 = "", str2="";

        for(int i = s.length() - 1; i >= 0; i--) {
            
            if(s.charAt(i) == '#')
                count++;

            else if(count > 0)
                count--;
            
            else
                str1 = s.charAt(i) + str1;
        }

        count = 0;
        
        for(int j = t.length() - 1; j >= 0; j--) {
            
            if(t.charAt(j) == '#')
                count++;
            
            else if(count > 0)
                count--;
            
            else
                str2 = t.charAt(j) + str2;
        }

        return str1.equals(str2);
        
    }
}