package automationprogram;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,45,6};
		int size=a.length;
		for(int i=0;i<=(size-1);i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		
		//reverse the array

			for(int i=(size-1);i>=0;i--) {
				 System.out.print(a[i]+",");
			}

	}

}
