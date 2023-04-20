package String;

public class Startswith {

	public static void main(String[] args) {
		String a="Velocity";
		String b="velocity";
		boolean result=a.startsWith("Velo");
		System.out.println(result);
		result=a.startsWith("Volo");
		System.out.println(result);
		//endswith string
		result=a.endsWith("ity");
		System.out.println(result);
		
	}

}
