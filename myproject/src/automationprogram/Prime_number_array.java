package automationprogram;

public class Prime_number_array {

	public static void main(String[] args) {
		int []a= new int[40];
		
		int count;
		for(int i=1;i<=a.length;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
		
	}

	}


