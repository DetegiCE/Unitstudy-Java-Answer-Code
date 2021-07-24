import java.util.Scanner;

public class DoWhileSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i += 1;
		} while(i <= n);
		
		System.out.println(sum);
	}
}
