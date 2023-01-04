package ExceptionHandling.javabasics;

public class Exception10 {
	  
	    //function to check if person is eligible to vote or not   
	    public static void validateAge(int age) {  
	        if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	    //main method  
	    public static void main(String args[]){  
	        //calling the function  
	    	try {
	    		validateAge(10);
	    	}catch(ArithmeticException a) {
	    		System.out.println("Exception handled...");
	    	System.out.println(a);
	    		
	    		//a.printStackTrace();
	    	}
	        System.out.println("rest of the code...");    
	  }    
	}    


