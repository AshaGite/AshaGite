package sample;

public class Reversearray {

	public static void main(String[] args) {
		
		int a[]= {34,4,5,6};
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
