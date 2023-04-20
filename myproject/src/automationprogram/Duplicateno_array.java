package automationprogram;

public class Duplicateno_array {

	public static void main(String[] args) {
		int[]a= {1,2,4,1,5,3,4,6,7,2,8,3,9,6};
		System.out.println("Duplicate element:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					System.out.println(a[j]);
			}
	}

	}
}
