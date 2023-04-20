package automationprogram;

public class Count_vowels_in_String {

	public static void main(String[] args) {
		String a="Asha is a good girl";
		a=a.toLowerCase();
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||
					a.charAt(i)=='i'||a.charAt(i)=='o'||
					a.charAt(i)=='u') {
			count++;
					
		}
	}
	System.out.println("Total no of vowels in string are: " + count);

}
}


