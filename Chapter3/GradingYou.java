import java.util.Scanner;

public class GradingYou {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String gpa;
		if(score >= 95) {
			gpa = "A+";
		}
		else if(score >= 90) {
			gpa = "A0";
		}
		else if(score >= 85) {
			gpa = "B+";
		}
		else if(score >= 80) {
			gpa = "B0";
		}
		else if(score >= 75) {
			gpa = "C+";
		}
		else {
			gpa = "C0";
		}
		System.out.println(gpa);
	}
}
