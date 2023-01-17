package Week02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

class A004 {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int i = 0;
        
        for(int num : arr) {
            
            if(num % divisor == 0) {
                
                answer.add(num);
                i++;
                
            }
            
        }
        
        if(answer.size() == 0)
            answer.add(-1);
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}