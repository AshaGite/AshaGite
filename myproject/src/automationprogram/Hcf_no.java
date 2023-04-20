package automationprogram;

public class Hcf_no {

	public static void main(String[] args) {
		{
		    int a = 8; 
		    int b = 10; 
		    int c=0;

		    for (int i = 1; i <= a || i <= b; i++)
		      {
		     if (a % i == 0 && b % i == 0) {
		        c = i;
		      }

		    
		  }
		    System.out.println("The HCF: "+ c);
	
		}

	}
	}
