 package automationprogram;

import java.util.Scanner;

public class A{
	public static void main(String[] args) {
	
		String a="pop";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.toLowerCase().equals(b.toLowerCase())) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("not Palindrome String");
		}
		
		
		
		
		
		
	}
		}




			
