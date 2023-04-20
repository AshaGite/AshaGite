package automationprogram;

import java.util.Scanner;

public class Scannerusing_string {

	public static void main(String[] args) {
		//String a="Asha";
				//String b="";
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string: ");
				String s=sc.nextLine();	
				for(int i=s.length()-1;i>=0;i--) {
					char result=s.charAt(i);
					System.out.print(result);
		}
		
	}

}
