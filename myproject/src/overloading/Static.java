package overloading;

public class Static {
	static int a=15;
		   int b=34;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before the object");
		System.out.println("Demo.a="+Demo.a);
		
		Demo x=new Demo();   //x.b=34
		Demo y=new Demo();      //y.b=34
	
		System.out.println("After the object");
		System.out.println("Demo.a="+Demo.a);
		System.out.println("x.a="+x.a);
		System.out.println("y.a="+y.a);
		
		System.out.println("==============");
		x.a=1555;
		
		System.out.println("x.a="+x.a);
		System.out.println("y.a="+y.a);
	
	}
	

}
