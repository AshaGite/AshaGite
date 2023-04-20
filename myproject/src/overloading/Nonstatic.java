package overloading;

public class Nonstatic {
	static int a=15;
		   int b=34;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo.a="+Demo.a);
		
		Demo x=new Demo();    //x.b=34
		Demo y=new Demo();     //y.b=34
		System.out.println("x.b="+x.b);
		System.out.println("y.b="+y.b);
		
		System.out.println("===================");
		x.b=455;
		System.out.println("x.b="+x.b);
		System.out.println("y.b="+y.b);
		
		
		
		
	}

}
