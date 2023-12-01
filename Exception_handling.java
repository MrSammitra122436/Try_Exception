 package javaTpoint;

public class Exception_handling {
	public static void main(String[] args) {
		try {
			int a = 50;
			int b = 0;
			double c = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException = " + e);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException "+e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("remaining code");
	}
}
