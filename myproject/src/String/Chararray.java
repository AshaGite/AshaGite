package String;

public class Chararray {
		//char to array
	public static void main(String[] args) {
		String a="Velocity katraj pune";
		String b="";
		System.out.println(a.toCharArray());
		char[]result=a.toCharArray();
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
			}
		//Array to String
		for(int i=0;i<result.length;i++) {
			b=b+result[i];
		}
		System.out.println(b);
		
	}

}
