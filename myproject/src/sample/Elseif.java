package sample;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=897;
		int b=688;
		int c=7976;
		System.out.println("start");
		if(a>b)
		{
			if(a>c) 
			{
				System.out.println("a is large");
			}
			else 
			{
				System.out.println("c is large");
			}
		}
		else 
		{
			if(b>c) 
			{
				System.out.println("b is largest");
			}
			else 
			{
				System.out.println("c is largest");
			
		    }
		}
	}
}

	


