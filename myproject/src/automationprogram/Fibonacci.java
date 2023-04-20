package automationprogram;

public class Fibonacci {
//it is first two no. add next line and then additon of second  
	//-two numbers in next line.
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		//int i;
		int num=10;    
	//	 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(int i=1;i<=num;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
	}

}
}
