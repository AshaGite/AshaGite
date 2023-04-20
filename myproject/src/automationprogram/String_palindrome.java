package automationprogram;

public class String_palindrome {

	public static void main(String[] args) {
		 String a = "Non", 
			b = "";
		    int r=a.length();
		    //int strLength = str.length();

		    for (int i = (a.length() - 1); i >=0; --i) {
		      b = b + a.charAt(i);
		    }

		    if (a.toLowerCase().equals(b.toLowerCase())) {
		      System.out.println(a + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(a + " is not a Palindrome String.");
		    }

	}

}
