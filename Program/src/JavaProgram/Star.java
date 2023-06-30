package JavaProgram;

public class Star {

	public static void main(String[] args) {
//	for(int i=0;i<=5;i++) {
//	for(int j=0;j<=5;j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
//	for(int i=10;i>=0;i--) {
//		for(int j=1;j<=i;j++) {
//				System.out.print(" *");
//			}
//		System.out.println();
//		}
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
}
//	for(int i=11;i>=0;i--) {
//		for(int j=0;j<=i;j++) {
//			System.out.print(" *");
//		}
//		System.out.println();
//	}
		for(int i=0;i<8;i++) {
			for(int j=(8-1);j>=0;j--) {
				System.out.print(" ");
			}
			System.out.println();
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
