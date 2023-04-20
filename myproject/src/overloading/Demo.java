package overloading;

public class Demo {
	static int a=15;
		   int b=34;

	public static void main(String[] args) {
		
		System.out.println(Demo.a);
		//System.out.println(Demo.b);
		//System.out.println(x.b);
		//System.out.println(b);
		Demo x=new Demo();        //x.b=34
		System.out.println(x.b);
		//System.out.println(Demo.b);
		Demo y=new Demo();        //y.b=34
		System.out.println(y.b);
		//System.out.println(Demo.b);
	}
	
	
	

}
