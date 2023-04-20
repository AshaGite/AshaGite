package overloading;



public class Dem1 {
	static int a=15;    //Initialization
	   int b=34;     //not in use
Dem1()
{
	a=23;      //new assignment
	b=67;       //initialization
}	
Dem1(int h){
	a=45;     //new assignment
	b=88;     //initialization
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before the object");
		System.out.println("Dem1.a="+Dem1.a);
		
		//Constructor call zero argument
		//1.object create x
		//2.Non static variable declaration x.b=34
		//3.Constructor code will be execute x.b=67,a=23
		
		Dem1 x=new Dem1();     //x.b
		System.out.println("x.b="+x.b);     //67
		System.out.println("Dem1.a="+Dem1.a);  //23

		//Constructor call Int type argument
		//1.object create y
		//2.non static variable declaration y.b=34
		//3.constructor will code execute y.b=88,a=45
		
		Dem1 y=new Dem1(1223);
		System.out.println("y.b="+y.b);
		System.out.println("Dem1.a="+Dem1.a);
	

	}

}
