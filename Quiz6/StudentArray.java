import java.util.Scanner;

class Student {
	int num;
	String name;
	public Student(String name, int num) {
		this.num = num;
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.name+" "+this.num);
	}
}

public class StudentArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stdArr[] = new Student[7];
		
		for(int i=0 ; i<stdArr.length ; i++) {
			String name = sc.next();
			int id = sc.nextInt();
			sc.nextLine();
			stdArr[i] = new Student(name, id);
			stdArr[i].print();
		}
	}
}
