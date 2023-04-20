package overloading;


public class D {
	//Input to the method
			static void add(int x, int y) {
				int z=x+y;
				System.out.println(z);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// a=23;
			// b=34;
			// c=a+b;
			//System.out.println(c);
			
			D.add(23,34);
			
			//a=45;
			//b=78;
			//c=a+b;
			//System.out.println(c);
			
			D.add(45,78);
			//a=98;
			//b=67;
			//c=a+b;
			//System.out.println(c);
			D.add(98,67);
			//a=76;
			//b=90;
			//c=a+b;
			//System.out.println(c);
			D.add(76,90);
			

	}

}
