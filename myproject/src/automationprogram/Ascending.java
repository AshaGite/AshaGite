package automationprogram;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5, 2, 8, 7, 10};
		int size=a.length;
        int c = 0;    
            
        
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i]+" ");    
        }    
            
        //Sort the array in ascending order 
        
        for (int i = 0; i < a.length; i++) 
        {     
            for (int j = i+1; j < a.length; j++)
            {     
               if(a[i] >a[j])
               {    
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

}		////////////////////////////////////
