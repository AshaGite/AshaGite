package automationprogram;

public class Three_largest_number {

	public static void main(String[] args) {
		int a=100;
		int b=210;
		int c=300;
		if(a>b) {
			if(a>c) {
				System.out.println("a is largest no.");
			}
			else {
				System.out.println("c is largest no.");
			}
		}
		else {
			if(b>c) {
				System.out.println("b is largest no.");
			}
			else {
				System.out.println("c is largest");
				
			}
		}

	}

}
