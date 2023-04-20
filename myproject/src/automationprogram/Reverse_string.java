package automationprogram;

public class Reverse_string {

	public static void main(String[] args) {
		String x = "My Space Class";
		String []y =x.split(" ");
		for(int i = y.length-1 ;i>=0;i--) {
			System.out.print(" "+y[i]);
	}	
	
	}
}

