package javaTpoint;

public class Neasted_Try {
	public static void main(String[] args) {
		System.out.println("Nested Try Block");
		
		try {
			// 1st block
			try {
				System.out.println("trying to devide by zero ");
				int a = 25/1;
			}
			catch(ArithmeticException e) {
				System.out.println("first inner try " + e);
			}
			// 2nd block
			try {
				System.out.println("trying OutOfBound ");
				int arr[] = new int[5];
				arr[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("second inner try " +  e);
			}
		}
		
		catch(Exception e){
			System.out.println("this is the outer catch block " + e);
		}
		
	}
}
