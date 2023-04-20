package overloading;

public class Demo1 {
	static int a=15;
	       int b=34;
static void test() 
{
System.out.println("static method");
}
void alpha()
{
System.out.println("Non static method");
}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
				test();
				Demo1.test();

	//alpha();
	//Demo1.alpha();
				Demo1 x=new Demo1();             //x.b=34
				Demo1 y=new Demo1();              // y.b=34

				x.alpha();
				y.alpha();

				x.test();
				y.test();


	}

}
