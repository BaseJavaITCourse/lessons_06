package task_02_abc;

public class Circle extends Figure {
	int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;

	}

	public void methodCircle_01() {
	}

	public void methodCircle_02() {
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (r != other.r)
			return false;
		return true;
	}

	
	

}
