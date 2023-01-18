package Week03;

import java.util.StringTokenizer;

public class A041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "3people     unFollowed  me";
		
		StringTokenizer strTok = new StringTokenizer(s, " ", true);
        StringBuilder strBld = new StringBuilder();

        while(strTok.hasMoreTokens()) {
        	
            String str = strTok.nextToken();
            
            if(str.startsWith(" ")) {
            	strBld.append(str);
                continue;
            }
            
            if(str.charAt(0) >= '0' && str.charAt(0) <= '9')
            	strBld.append(str.charAt(0));
            
            else if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
            	strBld.append((char)(str.charAt(0) - 32));
            
            else
            	strBld.append(str.charAt(0));
            
            strBld.append(str.substring(1).toLowerCase());
        }
        
        System.out.println(strBld.toString());
	}
}