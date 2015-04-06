package task_01_poli;

public class Rectangle extends Figure {

	int w;
	int h;

	public Rectangle(int x, int y, int x2, int y2) {
		super(x, y);
		this.w = x2;
		this.h = y2;
	}

	public void methodRectangle_01() {
	}

	public void methodRectangle_02() {
	}

	public void methodRectangle_03() {
	}

	public void methodRectangle_04() {
	}

	public void methodRectangle_05() {
	}

	@Override
	public void print() {
		System.out.println("Rectangle: " + x + "  " + y + "  " + w + "  " + h);
	}

}
