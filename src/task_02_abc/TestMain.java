package task_02_abc;



public class TestMain {
	

	// method
	public static void main(String[] args) {
		Figure figure_1 = new Circle(1, 2, 3);
		Rectangle figure_2 = new Rectangle(1, 2, 3, 4);
		
			
		Figure figure ;
		
		
		//eqs
		Figure figure_3 = new Circle(1, 2, 3);
		Figure figure_4 = new Circle(1, 2, 3);
		
		System.out.println(figure_3.equals(figure_4));
		
	}

}
