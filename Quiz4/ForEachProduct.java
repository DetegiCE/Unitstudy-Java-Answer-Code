import java.util.Scanner;

public class ForEachProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int product = 1;
		
		for(int i=0 ; i<5 ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int k: arr) {
			product *= k;
		}
		System.out.println(product);
	}
}
