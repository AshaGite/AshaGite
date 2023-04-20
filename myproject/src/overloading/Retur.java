package overloading;


public class Retur {
	//Return type-output from the method
		static int add(int x,int y) {
			int z=x+y;
			return z;
		}
		public static void main(String[] args) {
			int r=Retur.add(34,48);
			r=Retur.add(r,45);
			r=Retur.add(r,67);
			r=Retur.add(r,89);
			System.out.println(r);
		}

}
