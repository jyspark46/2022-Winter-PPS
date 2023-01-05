package Week01;
import java.util.*;

class A002 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        pascal.add(new ArrayList<Integer>(1));
        pascal.get(0).add(1);
        
        for(int n = 2; n <= numRows; n++){
            
            ArrayList<Integer> row = new ArrayList<>(n);
            row.add(1);
            
            int i = 1;
            for(int lim = (n >> 1) + (n % 2); i != lim; i++) 
                row.add(pascal.get(n - 2).get(i) + pascal.get(n - 2).get(i-1));
            
            for(int j = i - 1 - n % 2; j >= 0; j--) 
                row.add(row.get(j));
            
            pascal.add(row);
        }
        
        return pascal;
            
    }
}