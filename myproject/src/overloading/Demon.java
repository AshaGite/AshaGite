package overloading;

public class Demon {
	static int a=15;
	int b=34;
	int c=55;
	Demon()
	{
		b=67;
	}
	Demon(int h)
	{
		c=88;
	
	}

	  
	public static void main(String[] args) {
		
		
		System.out.println("Demon.a="+Demon.a);	
		
		Demon x=new Demon();
		System.out.println("x.b="+x.b);   //67
		System.out.println("x.c="+x.c);    //55
		System.out.println("Demon.a="+Demon.a);   //15
		
		Demon y=new Demon(1223);
		System.out.println("y.b="+y.b);   //34
		System.out.println("y.c="+y.c);   //88
		System.out.println("Demon.a="+Demon.a);
	}

}
