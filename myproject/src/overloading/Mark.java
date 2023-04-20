package overloading;

public class Mark {
	static int total=2;
	int sci=0;
	int math=0;
	Mark()
	{
		sci=12;
		math=67;
	}
	Mark(int h){
		sci=56;
		math=100;
	}		
		
public static void main(String[] args) {
	
	Mark s1=new Mark();    //x.b
		float result =(s1.sci+s1.math)/total;
		System.out.println(result);
		
	Mark s2=new Mark(1223); 
		 result =(s2.sci+s2.math)/total;
		System.out.println(result);
	

	}

}
