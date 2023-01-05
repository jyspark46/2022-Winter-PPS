package Week01;
import java.util.*;

class A001 {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int greed = 0;
        for(int i = 0; i < s.length; i++) {
            
            if(greed >= g.length)
                break;
            
            if(s[i] < g[greed])
                continue;
            
            greed++;
        }
        
        return greed;
    }
}