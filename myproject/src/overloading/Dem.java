package overloading;


public class Dem {
	static int a=15;    //Initiliazation
	   int b=34;     //not in use
Dem()
{
	a=23;
	b=67;
}	   


	public static void main(String[] args) {
		
		System.out.println("Before the object");
		System.out.println("Dem.a="+Dem.a);
		
		//Constructor call
		//1.object create x
		//2.Non static variable declaration x.b=34
		//3.Constructor code wil be execute x.b=67
		
		Dem x=new Dem();     //x.b
		System.out.println("x.b="+x.b);     //67
		System.out.println("Dem.a="+Dem.a);  //23


	}

}
