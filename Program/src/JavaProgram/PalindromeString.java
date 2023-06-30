package JavaProgram;
public  class PalindromeString  { 
 	//a number that same after reverse - Palindrome
 public static void main(String[] args) {
	
	 String a="mom";
	 a=a.toLowerCase();
	 String b="";
	 for(int i=a.length()-1;i>=0;i--){
	 b=b+a.charAt(i);
	 }
	 if(a.toLowerCase().equals(b.toLowerCase())){
	 System.out.println(a+" is Palindrome String");
	 }
	 else{
	 System.out.println(a+ " is not Palindrome String");
	 }
		
		
		
		
	}
}