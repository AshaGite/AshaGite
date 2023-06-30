package JavaProgram;

public class Vowels {

	public static void main(String[] args) {
String n="ashio";
n=n.toLowerCase();
int c=0;
	for(int i=0;i<n.length();i++) {
		
	if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'
			||n.charAt(i)=='o'||n.charAt(i)=='u') {
		c++;

	}


	}
	System.out.println("Total no.of vowel is: "+c);


	}
	}

