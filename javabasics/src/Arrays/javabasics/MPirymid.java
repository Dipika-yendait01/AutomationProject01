package Arrays.javabasics;

public class MPirymid {
    public static void main(String args[]) {
    	
    	for(int i=0;i<5;i++) {  //no.of rows in pyramid
    	     for(int j=0;j<=i;j++) {  //pattern in pyramid
    		     System.out.print("* ");
    		}
    	     System.out.println();
    	 }

    	for(int i=1;i<5;i++) {  //no.of rows in pyramid
    	     for(int j=1;j<=i;j++) {  //pattern in pyramid
    		     System.out.print(j+" ");
    		}
    	     System.out.println();
    	 }
    	for(int i=0;i<5;i++) {  //no.of rows in pyramid
   	     for(int j=0;j<=i;j++) {  //pattern in pyramid
   		     System.out.print(i+" ");
   		}
   	     System.out.println();
   	 }
    }
    
}
