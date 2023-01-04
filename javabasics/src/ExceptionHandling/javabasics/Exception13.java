package ExceptionHandling.javabasics;

public class Exception13 {
	// Throwing Unchecked Exception
	  
	    //function to check if person is eligible to vote or not   
	    public static void signalTimeout(long time) throws InterruptedException  { 
	    	System.out.println("Signal started");
	        if(time>1000) {  
	              
					Thread.sleep(time); //it will causes the currently executed thread to sleep
	            }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	        System.out.println("Signal ends...");
	    }  
	    //main method  
	    public static void main(String args[])  throws InterruptedException  {  
	        //calling the function  
	    	System.out.println("I am main....");
	    	signalTimeout(10);
	        System.out.println("rest of the code...");    
	  }    
	}  

