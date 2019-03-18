package Test;

public class SortArray {
	int i=0;
	static int j=0;
	

	public static void main(String[] args) 
    { 
		String [] a1 = {"ark","arks","naanu","neenu"}; 
		
	
		System.out.println("Before Sorting");
		for(int i=0; i<a1.length;i++) 
		{
			 j = i-0;
				i=0;
				
				while(i<j)
				{
                
                
                    String temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                    i++;
                    j--;
                }
            }
		
		System.out.println("After Sorting");
		for(int i=0; i<a1.length;i++) 
		{
			
		
			System.out.println(a1[i]);
		}
	}
    }

	
	

