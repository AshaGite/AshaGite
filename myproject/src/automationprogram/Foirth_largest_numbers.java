package automationprogram;

public class Foirth_largest_numbers {

	public static void main(String[] args) {
		int a=1000;
		int b=210;
		int c=380000;
		int d=40;
		
		if(a>b) 
		{
			if(a>c) { 
			
				if(a>d) 
				{
					System.out.println("a is greater");
				}
				else 
				{
					System.out.println("d is greater");
				}
		}
			
			else 
			{
				if(b>c) 
				{
					if(b>d) 
					{
						System.out.println("b is greter");
					}
					else 
					{
						System.out.println("d is greter");
						
					}
					
				}
			
	
		else if(c>d)
		{
				System.out.println("c is greter");
		}
			else 
			{
				System.out.println("d is greter");
			}
		}	

	}

}
}