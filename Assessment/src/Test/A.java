package Test;

public class A {

	static int x =10;
	
	static class B{
		
		public void method() {
		System.out.println(x);
			
		}
		
		static {
			
		 x=100;
	}
}	
	public static void main(String args[])
	{
		A.B ref = new A.B();
		ref.method();
		
	}
}
