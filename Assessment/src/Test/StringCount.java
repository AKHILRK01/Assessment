package Test;

public class StringCount {

	public static void main(String[] args)
	{
		
		String str = "Hello Good Morning akhil";
		Count(str);
		
		
	}

	private static void Count(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		int digit=0;
		int alpha=0;
		for(int i = 0; i < str.length()-1; i++){
			
			if(str.charAt(i)!=' ') {
				
				count++;
			}
			
			else if(Character.isDigit(ch[i]))
			{
				
				digit++;
			}
			
			else 
			{
				alpha=alpha+1;
			}
		
		
		}
		
		System.out.println("Count:" + count);
		System.out.println("digit:" + digit);
		System.out.println("aplha:" + alpha );
	}	
}
