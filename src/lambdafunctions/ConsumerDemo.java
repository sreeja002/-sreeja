package lambdafunctions;
import java.util.*;
import java.util.function.*;
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> n=new ArrayList<>();
		n.add("Coffee");
		n.add("Tea");
		n.add("Expresso");
		n.add("Capacinnou");
		n.add("Black coffee");
		
		Consumer<String> c=(a)-> System.out.println(a);
		Consumer<String> c1=(a)-> System.out.println(a.length());
		
		for(String i:n){
			c.andThen(c1).accept(i);
			
		}
		
		
	}

}
