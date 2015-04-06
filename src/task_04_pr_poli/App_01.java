package task_04_pr_poli;

/**
 *
 */
public class App_01 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println("a.i -> " + a.i);
        System.out.println("a.getI()-> " + a.getI());
    }
}


class A {
    //field
    int i = 3;
    //method
    int getI() {
        return i;
    }
}


class B extends A {
	//field
    int i = 5;
  //method
    int getI() {
        return i;
    }
}










