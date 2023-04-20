package fournumber;

public class Fourno 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10000;
		int b=2;
		int c=300;
		int d=40000;
		if(a>b) 
		{
			if(a>c)
			{
				if(a>d) 
				{
					System.out.println("A is Greter");
				}
				else 
				{
					System.out.println("D is Greter");
				}
				
			}
			else 
			{
				if(b>c) 
				{
					if(b>d) 
					{
						System.out.println("B is Greter");
					}
					else 
					{
						System.out.println("D is Greter");
					}
			     }
			
				
			}
		}
			 
			else 
			{
				if(c>d)
				{
					System.out.println("C is Greter");
				}
				else 
				{
					System.out.println("D is Greter");
				}
			}
		}

	}



