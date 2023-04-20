package sample;

public class Forstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=10;
		for(int b=1;b<=line;b++) 
		{
			for(int a=(line-1);a>=b;a--) 
			{
				System.out.print(" ");
			}
			for(int a=1;a<=b;a++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}


	}

}
