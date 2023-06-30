package JavaProgram;

public class LargeArray {

	public static void main(String[] args) {
int a[]= {3,40,5,6};
int max=a[0];
for(int i=1;i<a.length;i++) {
	if(a[i]>max) {
		max=a[i];
	}
}
System.out.println("maximum no.of array is: "+max);

	}

}
