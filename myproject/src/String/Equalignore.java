package String;

public class Equalignore {
//ignore the upper or lower case,character is same
	public static void main(String[] args) {
		String a="Velocity";
		String b="velocity";
		String c=new String("VElocity");
		String d=new String("Velocity");
	boolean result=a.equalsIgnoreCase(b);	
	System.out.println(result);
	result=a.equalsIgnoreCase(c);
	System.out.println(result);
	result=c.equalsIgnoreCase(b);
	System.out.println(result);
	}

}
