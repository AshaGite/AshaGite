package String;

public class equal {
//Data comparison  Data same or not
	public static void main(String[] args) {
		String a="Velocity";
		String b="velocity";
		String c=new String("Velocity");
		String d=new String("Velocity");
	boolean result=a.equals(c);
	System.out.println(result);
	result=c.equals(a);
	System.out.println(result);
	result=c.equals(b);  //case sensitive(V v)
	System.out.println(result);

	}

}
