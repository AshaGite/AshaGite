package sample;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=87;
		int b=68;
		int c=776;
		System.out.println("start");
		if(a>b)
		{
			System.out.println("Condition1=true");
			if(a>c) {
				System.out.println("Hi");
		}
		else {
			System.out.println("Hello");
		}

	}
	else {
		System.out.println("Condition1=false");
	}
	System.out.println("End");
	
		}
}
