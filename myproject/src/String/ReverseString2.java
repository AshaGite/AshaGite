package String;

public class ReverseString2 {

	public static void main(String[] args) {
		String x = "My Space Class";
		String []y =x.split(" ");
		String z = "";
		for(int i = y.length-1 ;i>=0;i--) {
			z = z + " "+ y[i];
		}
		System.out.println(z);// TODO Auto-generated method stub
	}

}
