package automationprogram;

public class ReverseStringEachWord  {

	public static void main(String[] args) {

		String a = "Asha Babasaheb Gite";
		String[] words = a.split(" ");
		String r = "";

		for (String word : words) {
		    String reversedWord = "";
		    for (int i = word.length() - 1; i >= 0; i--) {
		        reversedWord += word.charAt(i);
		    }
		    r += reversedWord + " ";
		}

		System.out.println(r.trim());
	}
		
	
	}


