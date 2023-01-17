package Week02;
import java.util.*;

class A073 {
    public List<String> fizzBuzz(int n) {

        ArrayList<String> str = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
        	
            if(i % 15 == 0)
                str.add("FizzBuzz");
            
            else if(i % 3 == 0)
                str.add("Fizz");
            
            else if(i % 5 == 0)
                str.add("Buzz");
            
            else
                str.add("" + i);
        }

        return str;
    }
}