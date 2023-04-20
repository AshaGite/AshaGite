package sample;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=87;
		int b=688;
		int c=776;
		System.out.println("start");
		if(a>b)
		{
			System.out.println("condition1=true");
		}
		else 
		{
			System.out.println("condition1=false");
			if(a>c) 
			{
				System.out.println("Hi");
		    }
			else 
			{
			    System.out.println("Hello");
		    }
		}
		System.out.println("End");
	}

}
