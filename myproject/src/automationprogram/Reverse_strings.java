package automationprogram;

public class Reverse_strings {

	public static void main(String[] args) {
		String a= "Asha Babasaheb Gite";
		String[]b=a.split("");
		String c=" ";
		for(int i=a.length()-1;i>=0;i--) {
			c=b[i];
		System.out.print(c);
		}
	}

}
