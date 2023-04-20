package automationprogram;

public class LargestArray {

	public static void main(String[] args) {
		int[]a={25,11,7,750,560};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Largest no is:"+max);
		

	}

}
