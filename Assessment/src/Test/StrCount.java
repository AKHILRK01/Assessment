package Test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class StrCount {

	public static void main(String[] args) {

		String str = "HELLO good morning akhil";
		
	Map<Character, Integer> hs = new LinkedHashMap<Character, Integer>();

	        
			for (int i = 0; i <=str.toLowerCase().length()-1; i++) { 
	           
	        	int count = 0;
	        	
	            for (int j = 0; j < str.toLowerCase().length(); j++) { 
	  
	                
	                if (str.charAt(i) == str.charAt(j)) {  
	                    count++;                 
	            
	                }
	                
	         } 
	            
	         hs.put(str.charAt(i),count);
	         
	        }
	        
	        Set<Character> s = hs.keySet();
	        Iterator<Character> itr = s.iterator();
	        while(itr.hasNext()) {
	        Object obj = itr.next();
	        System.out.println(obj + " " + hs.get(obj));
	    /*    if(str.charAt(i)!=' ') {
	        	
	            System.out.println("Number of Occurrence of " + 
		                 str.charAt(i) + " is:" + count);  }      */
	        }    
	        
	 }
}


