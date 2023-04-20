package Methodchaining;
public class Execution{
	public static void main(String[] args) {
	Pineee f=new Pineee();
	Pune x=f.beta();
	P1 y=x.alpha();
	M1 z=y.demo();
	z.test();
	f.beta().alpha().demo().test();
	}
}

