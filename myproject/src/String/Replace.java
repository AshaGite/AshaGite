package String;

public class Replace {

	public static void main(String[] args) {
		String a="Velocity class pune in katraj";
		String b="velocity";
		String c=new String("Velocity");
		String d=new String("Class");
		String result=a.replace("Velocity","VELOCITY");
		System.out.println(result);
		result=a.replace('t','O');
		System.out.println(result);
		result=a.replace("e","ABCDE");
		System.out.println(result);
	}
}
