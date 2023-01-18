package Week03;

public class A026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 13;
		
		String temp = Integer.toString(x);
		int sum = 0;

        for(int j = 0; j < temp.length(); j++)
        	sum += temp.charAt(j) - '0';
        
        if(x % sum == 0)
        	System.out.println("true");
        
        else
        	System.out.println("false");
	}
}