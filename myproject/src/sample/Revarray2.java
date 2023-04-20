package sample;

public class Revarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,4,5,6,87,98};
		int size=a.length;
		for(int i=0;i<=(size-1);i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		
		//reverse the array
		int b[]=new int[a.length];
		for(int j=0;j<=(a.length-1);j++) {
			b[j]=a[(a.length-1)-j];
		}
		a=b;
		System.out.println();
		for(int i=0;i<=(size-1);i++) {
			System.out.print(a[i]+",");
		}
			
	}

}
