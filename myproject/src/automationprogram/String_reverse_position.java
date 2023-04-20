package automationprogram;

public class String_reverse_position {

	public static void main(String[] args) {
		String x = "My Space Class";
		String y ="";
		for(int i = x.length()-1 ;i>=0;i--) {
			y = y + x.charAt(i);
		}
		System.out.println(y);
		
	}

}
