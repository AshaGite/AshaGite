package String;

public class Split {

	public static void main(String[] args) {
		String a="Velocity class pune in class katraj";
		String b=" ";
		String c=new String("Velocity");
		String d=new String("Class");
		String []result=a.split("class");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		System.out.println("============");
		result=a.split("    ");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
