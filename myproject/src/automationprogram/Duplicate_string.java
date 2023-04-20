package automationprogram;

public class Duplicate_string {

	public static void main(String[] args) {
		String[]a= {"Rani","soni","Meena","Rani","usha","soni","shweta","Meena"};
		for(int i=0;i<a.length;i++) {
			String to_Compare=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(to_Compare.equals(a[j])) {
				System.out.println("Duplicate name:"+" "+to_Compare);	
				}
			}
		}
	}
}


