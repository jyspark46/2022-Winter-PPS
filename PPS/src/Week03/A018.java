package Week03;

import java.util.*;

public class A018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		int[] aArr = new int[N];
		int[] bArr = new int[N];
		
        for(int i = 0; i < N; i++)
        	aArr[i] = keyboard.nextInt();
        
        for(int j = 0; j < N; j++)
        	bArr[j] = keyboard.nextInt();
        
        Arrays.sort(aArr);
        
        Integer[] tmp = Arrays.stream(bArr).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());
        bArr = Arrays.stream(tmp).mapToInt(Integer::intValue).toArray(); 

        int sum = 0;
        for(int k = 0; k < N; k++)
        	sum += (aArr[k] * bArr[k]);
        
        System.out.println(sum);
        
        keyboard.close();
	}
}
