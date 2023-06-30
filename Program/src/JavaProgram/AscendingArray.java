package JavaProgram;

public class AscendingArray {

	public static void main(String[] args) {
		int a[]= {50,40,30,20,10};
		int c;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
