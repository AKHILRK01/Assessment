package Test;

public class Count {

	
	public static void main(String[] args)
	{
		
		String str = "Hello Good Morning akhil";
		int count=0;
		
		
		for(int i = 0; i < str.length()-1; i++){
			
		
				if(str.charAt(i)!=' ') {
					
					count++;
				}
		
		}
		
		System.out.println("Count:" + count);
		
	}	
}
	
	
