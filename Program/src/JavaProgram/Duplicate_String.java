package JavaProgram;

public class Duplicate_String {

	public static void main(String[] args) {
String a[]= {"ab","ac","ab","ad","ae","ac"};
for(int i=0;i<a.length;i++) {
	String to_compare=a[i];
	for(int j=i+1;j<a.length;j++) {
		if(to_compare.equals(a[j])) {
			System.out.println("Duplicate String is: "+to_compare);
		}
	}
}
		
		
		
	}

}
