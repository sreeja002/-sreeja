package methodRefpackage;

public class MethodRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleIntrest obj =new SimpleIntrest();
		Intrest i= obj::intrest;
		i.calculate(20000,3,4);

	}

}
