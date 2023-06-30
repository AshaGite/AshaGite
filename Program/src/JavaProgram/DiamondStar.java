package JavaProgram;

public class DiamondStar {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			for(int j=(10-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=10;i>=0;i--) {
			for(int j=(10-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
			
			
		
		
		}
		
	
	}
}











		
		//		String s="Firefox";
//		char targetChar='f';
//		int count=0;
//		for(int i=0;i<s.length();i++){
//		if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(targetChar)){
//		count++;
//		}
//		}
//		System.out.println("Number of occurrences of'"+targetChar+"':"+count);

	
