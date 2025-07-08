package JavaConstructors;

public class Repeated {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,4,3,5,2,1,8,7,8,9,10};
		
		 for (int i = 0; i < arr.length ; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i] + " is repeating");
	                }
	            }
		 }
	}
}

	        
		

        			       
            
          
     
      
		
		