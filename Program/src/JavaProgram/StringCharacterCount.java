package JavaProgram;

public class StringCharacterCount {

	public static void main(String[] args) {
		
		String s = "Asha";
        char targetChar = 'a';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(targetChar)) {
                count++;
            }
        }

        System.out.println("Number of occurrences of '" + targetChar + "': " + count);
    }

}
	
