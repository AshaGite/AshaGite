package String;

public class Concat {

	public static void main(String[] args) {
		String a="Velocity";
		String b="velocity";
		String c=new String("Velocity");
		String d=new String("Class");
		String result=a.concat(d);
		System.out.println(result);
		
		result=a.concat("Batch");
		System.out.println(result);
		//length of String
		//int result1=a.length();
		//System.out.println(result1);
	}

}
