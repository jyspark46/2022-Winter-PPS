package Week02;
class A074 {
    public boolean isPalindrome(String s) {

        if(s == null || s.length() == 0)
            return true;

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder(s);
        str.append('a');
        str.insert(0, 'a');
        
        int i = 0, j = str.length() - 1;
        while(i < j) {

            while(!Character.isLetterOrDigit(str.charAt(i)))
                i++;
           
            while(!Character.isLetterOrDigit(str.charAt(j)))
                j--;
           
            if(str.charAt(j) == str.charAt(i)) {
                i++;
                j--;
            }

            else
                return false;
        }

        return true; 
    }
}