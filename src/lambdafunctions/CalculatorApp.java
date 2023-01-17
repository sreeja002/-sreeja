package lambdafunctions;

public class CalculatorApp {
	public void getAmount(IntrestCalculator obj)
	{
		System.out.println(obj.simpleIntrest(13000,3,4));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorApp obj1= new CalculatorApp();
		obj1.getAmount((p,r,t)->p*r*t/100);
		}

}
