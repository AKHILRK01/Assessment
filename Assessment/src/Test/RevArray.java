package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RevArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp;
		
		
		ArrayList<String> al = new ArrayList<String>(); 
 
        al.add("ark"); 
        al.add("arks"); 
        al.add("naanu"); 
        al.add("neenu"); 
        al.add("swap");
        System.out.print("Elements before reversing:"); 
        for(int i=0; i<al.size();i++) 
		{
			System.out.println(al.get(i));	
		}
        
        for(int i=0;i<al.size()/2; i++)
        {
        temp=al.get(i);
        al.set(i,al.get(al.size()-1-i));
        al.set(al.size()-1-i,temp);
        }
     
        System.out.print("\nElements after reversing:"); 
    	for(int i=0; i<al.size();i++)
    	{
        System.out.println(al.get(i));
    	}
     
        
	}
}