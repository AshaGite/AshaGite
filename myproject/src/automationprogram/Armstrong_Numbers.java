package automationprogram;

public class Armstrong_Numbers {
//153=1,5,3 sum of the nth power of that digit and its addition like 1+125+27=153,370,371,407,0 to 9 number are also armstrong number.
	public static void main(String[] args) {
	int r,p=0,temp;
	int n=370;			//sum of the nth power of that digit
	temp=n;
	while(n>0) {
		r=n%10;
		p=(p)+(r*r*r);
		n=n/10;
		
		
	}
	if(temp==p) {
		System.out.println("It is Armstrong number");
	}
	else {
		System.out.println("Not Armstrong number");
	}
		
		
		
	}
	
	
	
	}


