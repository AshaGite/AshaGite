package JavaProgram;
public class ArmstrongNumber{
//153,407,401
	//Armstrong number=the sum of the nth power of that digit and its addition.
public static void main(String[] args) {
	int r,p=0,temp;
	int n=407;
	temp=n;
	while(n>0) {
		r=n%10;
		p=(p)+r*r*r;
		n=n/10;
		
	}
		if(temp==p) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not Armstrong number");
		}
		
		
		
	}

}
