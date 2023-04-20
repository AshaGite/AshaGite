package overloading;

public class Test {
	Test(){
		
	}
	Test(int x){
		
	}
	Test(char y){
		
	}
	Test(int x, char y){
		
	}
	Test(char y, int x){
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
		new Test(100);
		new Test('$');
		new Test(100,'&');
		new Test('$',20);
	}

}
