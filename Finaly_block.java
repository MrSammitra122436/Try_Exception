package javaTpoint;

public class Finaly_block {
	
	public static void finaly1() {
		System.out.println("-------------------------");
		System.out.println("case 1:When an exception does not occur");
		System.out.println("-------------------------");
		try{   
			 int data=25/5;    
			  System.out.println(data);    
		}    
		//catch won't be executed  
		catch(NullPointerException e){  
			System.out.println(e);  
		}    
		//executed regardless of exception occurred or not  
		finally {  
			System.out.println("finally block is always executed");  
		}    
			    
		System.out.println("rest of phe code...");  
	}
	
	
	public static void finaly2() {
		System.out.println("-------------------------");
		System.out.println("Case 2: When an exception occurr but not handled by the catch block");
		System.out.println("-------------------------");
		try {
			int data = 25/0;
			System.out.println(data);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of phe code...exception not handled by the catch");  
	}
	
	public static void finaly3() {
		
		System.out.println("-------------------------");
		System.out.println("case 3: When an exception occurs and is handled by the catch block");
		System.out.println("-------------------------");
		try {    
			 System.out.println("Inside try block");  
		  //below code throws divide by zero exception  
		     int data=25/0;    
		       System.out.println(data);    
		 }   
		 catch(ArithmeticException e){  
		     System.out.println("Exception handled");  
		     System.out.println(e);  
		 }   
		 finally {  
		     System.out.println("finally block is always executed");  
		 }    
		 /*
		  *  finally block is executed after the try block and
		  *  then the program terminates abnormally.
		  *  it means below print statement is not execuated
		  */
		 System.out.println("rest of the code..."); 
	}
	
	
	public static void main(String[] args) {
		
		 //Case 1: When an exception does not occur 
//		 finaly1();
		
		// Case 2: When an exception occurs but not handled by the catch block
		finaly2();
		
		// case 3: When an exception occurs and is handled by the catch block
//		finaly3();
		
	}
}
