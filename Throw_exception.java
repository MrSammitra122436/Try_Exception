package javaTpoint;

import java.util.Scanner;

public class Throw_exception {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt()
;		
		if(a>50) {
			//  throw are use to check errors are checked at the compile time instead of runtime 
			throw new ArithmeticException("the person is not elegable to code ");
//			throw new IOException("sorry device error");  
		}
		else {
			System.out.println("the person is elagebal to code ");
		}
		
		System.out.println("rest of the code = ");
		
	}
}
