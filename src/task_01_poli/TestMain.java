package task_01_poli;

import java.util.Arrays;

public class TestMain {
	// field
	int numTable = 5;
	static final Figure[] arr1 = { new Figure(2, 6), new Circle(5, 6, 8),
			new Rectangle(6, 6, 4, 8) };
	
	static final int NUM_TABL_1 = 5;

	// method
	public static void main(String[] args) {
		Figure figure_1 = new Circle(1, 2, 3);
		Rectangle figure_2 = new Rectangle(1, 2, 3, 4);
		
		byte b =23;
		short s = 23;
		int i =23;
		
		//figure_2.call(s);

		figure_2.print();

		Circle circle = new Circle(2, 1, 4);
		circle.print();

		//Figure[] arr = { figure_1, figure_2, circle };		
		//System.out.println(Arrays.toString(arr1));

		//figure_1.call(s);
		
		
		
	}

}
