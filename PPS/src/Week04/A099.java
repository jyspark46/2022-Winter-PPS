package Week04;

import java.util.Stack;

class A099 {
    public boolean isValid(String s) {

        Stack stack = new Stack<>();
        int i = 0;

        while(i < s.length()) {

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));

            else {

                if(!stack.isEmpty() && stack.peek().equals('(') && s.charAt(i) == ')')
                    stack.pop();
                
                else if(!stack.isEmpty() && stack.peek().equals('{') && s.charAt(i) == '}')
                    stack.pop();
                
                else if(!stack.isEmpty() && stack.peek().equals('[') && s.charAt(i) == ']')
                    stack.pop();
                
                else
                    stack.push(s.charAt(i));
            }
            
            i++;
        }

        if(stack.isEmpty())
            return true;
        
        else
            return false;                
    }
}