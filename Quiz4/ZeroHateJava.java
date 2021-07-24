import java.util.Scanner;

public class ZeroHateJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		try {
			int result = dividend/divisor;
			System.out.println(result);
		} 
		catch(ArithmeticException e) {
			System.out.println("I HATE JAVA");
		}
	}
}
