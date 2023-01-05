package Week01;
class A043 {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder string = new StringBuilder();
        
        for(int i = 0; i < strs[0].length(); i += 1) { 

            for(String s : strs) { 
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i))
                    return string.toString();
            }
            
            string.append(strs[0].charAt(i));
        }

        return string.toString();
        
    }
}