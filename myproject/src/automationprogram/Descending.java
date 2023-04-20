	package automationprogram;

public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Initialize array   
        int a[] = {50,30,20,40,10};   
        int c= 0;  
        int size=a.length;
        
        //Displaying elements of original array
        
        
       // for (int i = 0; i < a.length; i++) {   
           // System.out.print(a[i] + " ");  
        //}  
          
        //Sort the array in descending order 
        
        for (int i = 0; i < a.length; i++) {   
            for (int j =i+1; j < a.length; j++) {   
               if(a[i] >a[j]) {  
                   c = a[i];  
                   a[i] = a[j];  
                   a[j] = c;  
               }   
            }   
        }  
          
        System.out.println();  
          
        //Displaying elements of array after sorting 
        
        
        for (int i = 0; i < a.length; i++) {   
            System.out.print(a[i] + " ");  
        }  

	}

}
