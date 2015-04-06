package task_01_poli;

public class Figure {
	int x;
	int y;

	public Figure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// method 4x
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public void methodFigure_01() {
	}

	public void methodFigure_02() {
	}

	public void print() {}

	public void print(int i) {
		System.out.println("Figure: " + i);
	}

	public void print(int i, String str) {
		System.out.println("Figure: " + i + "  " + str);
	}

	public void print(String str, int i) {
		System.out.println("Figure: " + i + "  " + str);
	}

	public void call(int i) {
		System.out.println("Figure");
	}
}
