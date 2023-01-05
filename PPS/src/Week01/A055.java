package Week01;
class A055 {
    public String removeOuterParentheses(String s) {
        
        int position = 0;
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){       

            if(c == '(') {

                if(position > 0)
                    str.append(c);
                
                position++;                               
            }

            if(c == ')') {             

                if(position > 1)
                    str.append(c);
                
                position--;
            }                 
        }

        return str.toString();

    }
}