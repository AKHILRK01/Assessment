package Test;

public class Rev {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j=0;
		String temp;
		   
		String [] arr = {"ark","arks","naanu","neenu"}; 
		  
		for(i=0;i<arr.length; i++)
		  j= i-0;
		i=0;
		
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("Reverse of array is:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);		}
	}

}
