class Point {
	private int x, y;
	Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	}
	void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point {
	private String color;
	ColorPoint(int x, int y, String color) {
	    super(x, y);
	    this.color = color;
	}
	void showColorPoint() {
		System.out.print(color+" ");
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(3, 4, "red");
		cp.showColorPoint();
	}
}
